/*
4) Crie um programa que receba do usuário um número X e um número N. Este programa deve imprimir quais são os números divisíveis por N entre 1 e X, inclusive.
*/
import java.util.Scanner;
public class repetiçao_ex04_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x = 0, n = 0;

		System.out.println("Digite um número: " );
		x = leia.nextInt();
		System.out.println("Digite outro número: " );
		n = leia.nextInt();


		for(int i = x; i >= 1; i--) {
			if(i % n == 0 ){
				System.out.println("Números Divisíveis: " + i);
			}

		}

		leia.close();
	}


}