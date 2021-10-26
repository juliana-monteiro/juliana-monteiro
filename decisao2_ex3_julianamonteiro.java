/*
3) Faça um algoritmo para ler um número inteiro e informar se o número é par ou ímpar.
*/
import java.util.Scanner;
public class decisao2_ex3_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;

		System.out.print("Digite um número inteiro: ");
		num = leia.nextInt();
		
		if(num % 2 == 0){
			System.out.println("O número é par. ");
		}
		
		else {
			System.out.println("O número é ímpar!!!. ");
		}
		
		leia.close();
	}
}
