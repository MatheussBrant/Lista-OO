import java.util.Scanner;

public class exercicio121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] soma = new int[tamanho];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        System.out.print("A soma dos vetores é: [");
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(soma[i]);
        }
        System.out.println("]");

        scanner.close();
    }
}
