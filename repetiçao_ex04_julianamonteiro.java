/*
4) Crie um programa que receba do usu�rio um n�mero X e um n�mero N. Este programa deve imprimir quais s�o os n�meros divis�veis por N entre 1 e X, inclusive.
*/
import java.util.Scanner;
public class repeti�ao_ex04_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x = 0, n = 0;

		System.out.println("Digite um n�mero: " );
		x = leia.nextInt();
		System.out.println("Digite outro n�mero: " );
		n = leia.nextInt();


		for(int i = x; i >= 1; i--) {
			if(i % n == 0 ){
				System.out.println("N�meros Divis�veis: " + i);
			}

		}

		leia.close();
	}


}