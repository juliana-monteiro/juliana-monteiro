//3) Receber um n�mero e imprimir todos os seus divisores.

import java.util.Scanner;
public class repeti�ao_ex03_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int div = 0;

		System.out.println("Digite um n�mero: " );
		div = leia.nextInt();


		for(int i = div; i > 0; i--) {
			if(div % i == 0){
				System.out.println("Divisores: " + i);
			}

		}
		leia.close();

	}


}