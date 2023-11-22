
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Escolha o tipo de conversão:");
	        System.out.println("1. Celsius para Fahrenheit");
	        System.out.println("2. Fahrenheit para Celsius");
	        System.out.print("Opção: ");
	        int opcao = scanner.nextInt();

	        System.out.print("Digite a temperatura: ");
	        double temperatura = scanner.nextDouble();

	        if (opcao == 1) {
	            double fahrenheit = (temperatura * 9/5) + 32;
	            System.out.println("Resultado em graus Fahrenheit: " + fahrenheit);
	        } else if (opcao == 2) {
	            double celsius = (temperatura - 32) * 5/9;
	            System.out.println("Resultado em graus Celsius: " + celsius);
	        } else {
	            System.out.println("Opção inválida.");
	        }

	        scanner.close();
	    }
	}


