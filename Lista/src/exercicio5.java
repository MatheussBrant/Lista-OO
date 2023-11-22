import java.util.Scanner;

public class exercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int idadeAnos = scanner.nextInt();

        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeHoras = idadeDias * 24;
        long idadeMinutos = (long) idadeHoras * 60;

        System.out.println("Sua idade em meses é: " + idadeMeses);
        System.out.println("Sua idade em dias é: " + idadeDias);
        System.out.println("Sua idade em horas é: " + idadeHoras);
        System.out.println("Sua idade em minutos é: " + idadeMinutos);

        scanner.close();
    }
}
