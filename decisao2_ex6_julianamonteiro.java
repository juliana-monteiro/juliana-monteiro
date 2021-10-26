/*
6) Faça um algoritmo para ler duas variáveis inteiras A e B e garantir que A e B fiquem em ordem crescente, ou seja, a variável deverá armazenar o menor valor fornecido e a variável
B o maior.
*/
import java.util.Scanner;
public class decisao2_ex6_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a, b, x;

		System.out.print("Digite o 1º número inteiro (A): ");
		a = leia.nextInt();
		
		System.out.print("Digite o 2º número inteiro (B): ");
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
