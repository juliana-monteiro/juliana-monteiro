/*
5) Fa�a um algoritmo para ler dois n�meros inteiros e escrever o maior.
*/
import java.util.Scanner;
public class decisao2_ex5_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1, num2;

		System.out.print("Digite o 1� n�mero inteiro: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o 2� n�mero inteiro: ");
		num2 = leia.nextInt();


		if(num1 > num2){
			System.out.println("O 1� n�mero � maior que o 2�. " + num1);
		}
		
		else {
			System.out.println("O 2� n�mero � maior que o 1�. " + num2);
		}
		
		leia.close();
	}
}

		