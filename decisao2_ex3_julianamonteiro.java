/*
3) Fa�a um algoritmo para ler um n�mero inteiro e informar se o n�mero � par ou �mpar.
*/
import java.util.Scanner;
public class decisao2_ex3_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;

		System.out.print("Digite um n�mero inteiro: ");
		num = leia.nextInt();
		
		if(num % 2 == 0){
			System.out.println("O n�mero � par. ");
		}
		
		else {
			System.out.println("O n�mero � �mpar!!!. ");
		}
		
		leia.close();
	}
}
