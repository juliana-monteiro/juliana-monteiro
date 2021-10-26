/*
2) Faça um algoritmo para ler dois números inteiros e informar se estes números são iguais ou diferentes.
*/
import java.util.Scanner;
public class decisao2_ex2_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1, num2;

		System.out.print("Digite o 1º número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		num2 = leia.nextInt();


		if(num1 != num2){
			System.out.println("Os números são diferentes. ");
		}
		
		else {
			System.out.println("Os números são iguais!!!. ");
		}
		
		leia.close();
	}
}

		