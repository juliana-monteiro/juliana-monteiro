/*
4) Fa�a um algoritmo para ler dois n�meros inteiros A e B e informar se A � divis�vel por B.
*/
import java.util.Scanner;
public class decisao2_ex4_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a, b;

		System.out.print("Digite o 1� n�mero inteiro: ");
		a = leia.nextInt();
		
		System.out.print("Digite o 2� n�mero inteiro: ");
		b = leia.nextInt();


		if(a % b == 0){
			System.out.println("O 1� n�mero (A) � divis�vel pelo 2� n�mero (B). ");
		}
		
		else {
			System.out.println("O 1� n�mero (A) N�O � divis�vel pelo 2� n�mero (B). :-( ");
		}
		
		leia.close();
	}
}
