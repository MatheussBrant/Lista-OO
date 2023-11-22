import java.util.Scanner;


public class exercicio1 {

	public static void main(String[] args) {
		float x, y, z, w; 
		System.out.println("Digite o valor total da conta:");
		Scanner scx = new Scanner(System.in); 
		x = scx.nextFloat();
		
		System.out.println("Digite a porcentagem de gorjeta que deseja deixar:");
		Scanner scy = new Scanner(System.in);
		y = scy.nextFloat();
		
		z = x * y/100 ; 
		w = x + z ; 
		System.out.printf("Valor da gorjeta: %.2f %n", z );
		System.out.printf("total a ser pago: %.2f %n", w );

	}

}

