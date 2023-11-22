import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        char[] caracteres = palavra.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            if (caracteres[inicio] != caracteres[fim]) {
                System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
                return;
            }
            inicio++;
            fim--;
        }

        System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");

        scanner.close();
    }
}
