/*
6) Fa�a um algoritmo para ler duas vari�veis inteiras A e B e garantir que A e B fiquem em ordem crescente, ou seja, a vari�vel dever� armazenar o menor valor fornecido e a vari�vel
B o maior.
*/
import java.util.Scanner;
public class decisao2_ex6_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a, b, x;

		System.out.print("Digite o 1� n�mero inteiro (A): ");
		a = leia.nextInt();
		
		System.out.print("Digite o 2� n�mero inteiro (B): ");
		b = leia.nextInt();


		if(a > b  ){
			x = a;
			a = b;
			b = x;
			
		}
		
		System.out.println("Ordem crescente. (A) " + a + " e (B) " + b);
		
		leia.close();
	}
}
