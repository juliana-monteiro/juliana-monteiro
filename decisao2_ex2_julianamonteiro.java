/*
2) Fa�a um algoritmo para ler dois n�meros inteiros e informar se estes n�meros s�o iguais ou diferentes.
*/
import java.util.Scanner;
public class decisao2_ex2_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1, num2;

		System.out.print("Digite o 1� n�mero inteiro: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o 2� n�mero inteiro: ");
		num2 = leia.nextInt();


		if(num1 != num2){
			System.out.println("Os n�meros s�o diferentes. ");
		}
		
		else {
			System.out.println("Os n�meros s�o iguais!!!. ");
		}
		
		leia.close();
	}
}

		