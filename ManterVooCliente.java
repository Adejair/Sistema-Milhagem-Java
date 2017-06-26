import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paulo Neto
 */
public class ManterVooCliente {

    public static ArrayList<VooCliente> controllerVooCliente = new ArrayList<>();
    private static final Scanner l = new Scanner(System.in);

    static void cadastrarVooCliente() {
        boolean cadastrando = true;
        while (cadastrando) {

            System.out.println("Cadastro de Voos Cliente");
            VooCliente novoVooCliente = new VooCliente();

            System.out.println("Codigo Cliente:");
            int codigoCliente = textInput();
            novoVooCliente.setCodigoCliente(codigoCliente);

            System.out.println("Codigo do Voo:");
            int codigoVoo = textInput();
            novoVooCliente.setCodigoVoo(codigoVoo);

            novoVooCliente.setData(textInput("\nData do Voo:: "));

            novoVooCliente.setHora(textInput("\nHora do Voo:: "));

            String cadastrar = textInput("\nAdicionar cadastro (S/N) ?\n");
            if (cadastrar.equalsIgnoreCase("s")) {
                System.out.println("\n Voo Cliente cadastrado !!!");
                controllerVooCliente.add(novoVooCliente);
            } else if (cadastrar.equalsIgnoreCase("n")) {
                System.out.println("\n Voo Cliente ignorado !!!");
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

    static void removerVooCliente() {
        if (controllerVooCliente.isEmpty()) {
            System.out.println("\nNão existem cadastros !!!\n");
        } else {
            System.out.println("Remover Voo Cliente");
            for (int i = 0; i < controllerVooCliente.size(); i++) {
                VooCliente vc = controllerVooCliente.get(i);
                vc.removerVooCliente();
            }
        }
    }

    static void manterVooCliente() {
        int menuAluno;

        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Cadastrar Voo Cliente");
        System.out.println("2 - Excluir Voo Cliente");

        menuAluno = l.nextInt();

        switch (menuAluno) {
            case 1:
                cadastrarVooCliente();
                break;
            case 2:
                removerVooCliente();
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
