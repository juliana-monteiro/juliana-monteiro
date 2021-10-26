//5) Crie um programa que receba 10 número inteiros e retorne o //maior entre eles.
import java.util.Scanner;
public class repetiçao_ex05_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x, maior = 0;


		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + " º número: ");
			x = leia.nextInt();
			if (maior < x){
				maior = x;
			}

		}
		System.out.println("Maior número digitado:  " + maior);

		leia.close();
	}

}