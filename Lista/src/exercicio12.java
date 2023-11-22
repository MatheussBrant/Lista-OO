import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de multiplicação para " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }

        scanner.close();
    }
}
