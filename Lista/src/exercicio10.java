import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inicial: ");
        int numero = scanner.nextInt();

        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }

        scanner.close();
    }
}
