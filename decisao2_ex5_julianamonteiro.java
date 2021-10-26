/*
5) Faça um algoritmo para ler dois números inteiros e escrever o maior.
*/
import java.util.Scanner;
public class decisao2_ex5_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1, num2;

		System.out.print("Digite o 1º número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		num2 = leia.nextInt();


		if(num1 > num2){
			System.out.println("O 1º número é maior que o 2º. " + num1);
		}
		
		else {
			System.out.println("O 2º número é maior que o 1º. " + num2);
		}
		
		leia.close();
	}
}

		