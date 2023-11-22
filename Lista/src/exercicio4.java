import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira disciplina: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira disciplina: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda disciplina: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda disciplina: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira disciplina: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira disciplina: ");
        double peso3 = scanner.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada das notas é: " + mediaPonderada);

        scanner.close();
    }
}
