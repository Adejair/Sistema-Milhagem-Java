import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paulo Neto
 */
public class ManterVoo {

    public static ArrayList<Voos> controllerVoos = new ArrayList<Voos>();
    private static final Scanner l = new Scanner(System.in);

    static void cadastrarVoo() {
        boolean cadastrando = true;
        while (cadastrando) {

            System.out.println("Cadastro de Voos");
            Voos novoVoo = new Voos();

            System.out.println("Codigo:");
            int codigoVoo = textInput();
            novoVoo.setCodigo(codigoVoo);

            novoVoo.setDestino(textInput("\nDestino do voo: "));

            System.out.println("Distancia do voo:");
            int distanciaVoo = textInput();
            novoVoo.setDistancia(distanciaVoo);

            novoVoo.setOrigem(textInput("\nOrigem do voo: "));

            String cadastrar = textInput("\nAdicionar cadastro (S/N) ?\n");
            if (cadastrar.equalsIgnoreCase("s")) {
                System.out.println("\n Voo cadastrado !!!");
                controllerVoos.add(novoVoo);
            } else if (cadastrar.equalsIgnoreCase("n")) {
                System.out.println("\n Voo ignorado !!!");
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

    static void removerVoo() {
        if (controllerVoos.isEmpty()) {
            System.out.println("\nNão existem cadastros !!!\n");
        } else {
            System.out.println("Remover Voo");
            for (int i = 0; i < controllerVoos.size(); i++) {
                Voos vc = controllerVoos.get(i);
                vc.destruirVoo();
            }
        }
    }
    
    static void manterVoo() {
        int menuAluno;

        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Cadastrar Voo");
        System.out.println("2 - Excluir Voo");

        menuAluno = l.nextInt();

        switch (menuAluno) {
            case 1:
                cadastrarVoo();
                break;
            case 2:
                removerVoo();
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
