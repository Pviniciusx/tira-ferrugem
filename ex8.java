import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int sala[][] = new int[10][12];
        int opcao;

        do {
            System.out.println("\nMENU DO CINEMA");
            System.out.println("1 - Reservar cadeira");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Mostrar mapa de cadeiras");
            System.out.println("4 - Mostrar cadeiras disponiveis/indisponiveis");
            System.out.println("5 - Encontrar sequencia de cadeiras disponiveis");
            System.out.println("6 - Encerrar menu");
            System.out.print("Escolha: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a linha (0-9): ");
                    int l = ler.nextInt();
                    System.out.print("Digite a coluna (0-11): ");
                    int c = ler.nextInt();
                    if (l >= 0 && l < 10 && c >= 0 && c < 12) {
                        if (sala[l][c] == 0) {
                            sala[l][c] = 1;
                            System.out.println("Cadeira reservada!");
                        } else {
                            System.out.println("Cadeira indisponivel.");
                        }
                    } else {
                        System.out.println("Posicao invalida.");
                    }
                    break;

                case 2:
                    System.out.print("Digite a linha (0-9): ");
                    l = ler.nextInt();
                    System.out.print("Digite a coluna (0-11): ");
                    c = ler.nextInt();
                    if (l >= 0 && l < 10 && c >= 0 && c < 12) {
                        if (sala[l][c] == 1) {
                            sala[l][c] = 0;
                            System.out.println("Reserva cancelada.");
                        } else {
                            System.out.println("Cadeira já está livre!");
                        }
                    } else {
                        System.out.println("Posicao invalida.");
                    }
                    break;

                case 3:
                    System.out.println("\nMapa de cadeiras (0=livre, 1=ocupado):");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 12; j++) {
                            System.out.print(sala[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4: 
                    int livres = 0, ocupados = 0;
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 12; j++) {
                            if (sala[i][j] == 0) livres++;
                            else ocupados++;
                        }
                    }
                    System.out.println("Livres: " + livres + " | Ocupados: " + ocupados);
                    break;

                case 5:
                    System.out.print("Informe quantidade de pessoas: ");
                    int qtd = ler.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < 10 && !encontrado; i++) {
                        int cont = 0;
                        for (int j = 0; j < 12; j++) {
                            if (sala[i][j] == 0) {
                                cont++;
                                if (cont == qtd) {
                                    System.out.println("Sequencia encontrada na fileira " + i +
                                            " da cadeira " + (j - qtd + 1) + " até " + j);
                                    encontrado = true;
                                    break;
                                }
                            } else {
                                cont = 0;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Sem sequencias disponiveis....");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 6);

        ler.close();
    }
}