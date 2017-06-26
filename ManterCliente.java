/**
 *
 * @author Paulo Neto
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ManterCliente {

    public static ArrayList<Clientes> controllerClientes = new ArrayList<Clientes>();
    private static final Scanner l = new Scanner(System.in);

    static void cadastrarClientes() {
        boolean cadastrando = true;
        while (cadastrando) {

            System.out.println("Cadastro de Cliente");
            Clientes novoCliente = new Clientes();

            System.out.println("Codigo:");
            int codigoCliente = textInput();
            novoCliente.setCodigo(codigoCliente);

            novoCliente.setNome(textInput("\nNome do cliente: "));
            novoCliente.setCpf(textInput("CPF: "));
            novoCliente.setSexo(textInput("Sexo: "));

            System.out.println("Categoria:");
            int categoriaCliente = textInput();
            novoCliente.setCategoria(categoriaCliente);

            System.out.println("Conjuge:");
            int conjugueCliente = textInput();
            novoCliente.setCodigoConjugue(conjugueCliente);

            String cadastrar = textInput("\nAdicionar cadastro (S/N) ?\n");
            if (cadastrar.equalsIgnoreCase("s")) {
                System.out.println("\n Cliente cadastrado !!!");
                controllerClientes.add(novoCliente);
            } else if (cadastrar.equalsIgnoreCase("n")) {
                System.out.println("\n Cleinte ignorado !!!");
            } else {
                System.out.println("\n Opção inválida, vou ignorar o cadastro só pra você ter que digitar denovo !!! \n");
            }
            String continua = textInput("\n Continuar cadastrando (S/N) ?\n");
            if (continua.equalsIgnoreCase("N")) {
                cadastrando = false;
            } else if (continua.equalsIgnoreCase("s")) {
                // se for s sai do if e volta para o inicio do while
            } else {
                System.out.println("\n Opção inválida, eu vou sair só porque você não colabora !!! \n");
                cadastrando = false;
            }
        }
    }

    static void removerCliente() {
        if (controllerClientes.isEmpty()) {
            System.out.println("\nNão existem cadastros !!!\n");
        } else {
            System.out.println("Remover Cliente");
            for (int i = 0; i < controllerClientes.size(); i++) {
                Clientes ic = controllerClientes.get(i);
                ic.removerCliente();
            }
        }
    }

    static void manterCliente() {
        int menuAluno;

        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Excluir Cliente");

        menuAluno = l.nextInt();

        switch (menuAluno) {
            case 1:
                cadastrarClientes();
                break;
            case 2:
                removerCliente();
                break;
            default:
                System.out.println("Este não é uma opção válida!");
        }
    }

    static String textInput(String label) {
        System.out.println(label);
        return l.next();
    }

    static int textInput() {
        return l.nextInt();
    }
}
