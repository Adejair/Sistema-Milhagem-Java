import java.util.Scanner;

class App {
  
  public static void main(String[] args) {
    int numSair = 0;

        while (numSair != 4) {
            int menuEscola;

            Scanner entrada = new Scanner(System.in);

            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Manter cliente");
            System.out.println("2 - Manter Voo");
            System.out.println("3 - Manter disciplina");
            System.out.println("4 - Sair\n");

            menuEscola = entrada.nextInt();

            switch (menuEscola) {
                case 1:
                    ManterCliente.manterCliente();
                    break;
                case 2:
                    ManterVoo.manterVoo();
                    break;
                case 3:
                    ManterVooCliente.manterVooCliente();
                    break;
                case 4:
                    numSair = 4;
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Este não é uma opção válida!");
            }
        }
    }
  }
