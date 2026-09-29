import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int matriz[][] = new int[4][4];
        int sPrincipal = 0;
        int sSecundaria = 0;

        System.out.println("Leitura da Matriz 4x4: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite o elemento ["+i+"]["+j+"]: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        // Diagonal Principal
        System.out.print("\nElementos da Diagonal Principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i]+" ");
            sPrincipal += matriz[i][i];
        }

        // Diagonal Secundária (Ajustado para print)
        System.out.print("\nElementos da Diagonal Secundaria: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3-i]+" ");
            sSecundaria += matriz[i][3-i];
        }

        // Somas e Comparação
        System.out.println("\n\nSoma da Diagonal Principal: "+sPrincipal);
        System.out.println("Soma da Diagonal Secundaria: "+sSecundaria);

        if (sPrincipal > sSecundaria) {
            System.out.println("A Diagonal Principal possui a maior soma!!");
        } else if (sSecundaria>sPrincipal) {
            System.out.println("A Diagonal Secundaria possui a maior soma!!");
        } else {
            System.out.println("As duas somas são iguais!!");
        }

    }
}