import java.util.Random;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        int tentativa;
        int numeroTentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 10.");
        do {
            System.out.print("Tentativa " + (++numeroTentativas) + ": ");
            tentativa = scanner.nextInt();

            if (tentativa < numeroAleatorio) {
                System.out.println("Tente novamente. O número é maior.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Tente novamente. O número é menor.");
            }
        } while (tentativa != numeroAleatorio);

        System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + numeroTentativas + " tentativas.");

        scanner.close();
    }
}
