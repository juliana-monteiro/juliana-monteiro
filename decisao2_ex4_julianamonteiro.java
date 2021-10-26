/*
4) Faça um algoritmo para ler dois números inteiros A e B e informar se A é divisível por B.
*/
import java.util.Scanner;
public class decisao2_ex4_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a, b;

		System.out.print("Digite o 1º número inteiro: ");
		a = leia.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		b = leia.nextInt();


		if(a % b == 0){
			System.out.println("O 1º número (A) é divisível pelo 2º número (B). ");
		}
		
		else {
			System.out.println("O 1º número (A) NÃO É divisível pelo 2º número (B). :-( ");
		}
		
		leia.close();
	}
}
