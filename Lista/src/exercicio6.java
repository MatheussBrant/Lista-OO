import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação de IMC: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação de IMC: Normal");
        } else if (imc < 30) {
            System.out.println("Classificação de IMC: Sobrepeso");
        } else {
            System.out.println("Classificação de IMC: Obesidade");
        }

        scanner.close();
    }
}
