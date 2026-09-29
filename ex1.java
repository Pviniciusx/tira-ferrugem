import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double soma = 0;
        double notas[] = new double[10];
        int nota_boa = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();
            soma += notas[i];
            if (notas[i] >= 7) {
                nota_boa++;
            }
        }
        double maior = notas[0];
        double menor = notas[0];
        int AbaixoDaMedia = 0;
        double media = soma / 10;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] < media) {
                AbaixoDaMedia++;
            }
        }
        System.out.println("\n A media das notas e: " + media);
        System.out.println("\n A menor nota e: " + menor);
        System.out.println("\n A maior nota e: " + maior);
        System.out.println("\n A quantidade de alunos com nota maior ou igual a 7 e: " + nota_boa);
        System.out.println("A quantidade de alunos abaixo da media e: " + AbaixoDaMedia);
    }
}