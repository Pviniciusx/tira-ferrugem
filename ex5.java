import java.util.Scanner;

/**
 *
 * @author fef
 */
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 20;

        int vetorOr[] = new int[n];
        int vetorOd[] = new int[n];
        int trocas = 0;
        int comp = 0;

        for (int i = 0; i < n; i++) {
            vetorOr[i] = ler.nextInt();
            vetorOd[i] = vetorOr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                comp++;
                if (vetorOd[j] > vetorOd[j + 1]) {
                    int aux = vetorOd[j];
                    vetorOd[j] = vetorOd[j + 1];
                    vetorOd[j + 1] = aux;
                    trocas++;
                }
            }
        }
        double mediana = (vetorOd[9] + vetorOd[10]) / 2.0;
        System.out.println("\nVetor Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorOr[i] + " ");
        }
        System.out.println("\nVetor Ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorOd[i] + " ");
        }
        System.out.println("\n\nQuantidade de comparacoes: " + comp);
        System.out.println("Quantidade de trocas realizadas: " + trocas);
        System.out.printf("Mediana dos valores: %.1f\n", mediana);
    }

}