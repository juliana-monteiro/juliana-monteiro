//7) Ler 20 n�meros inteiros e imprimir quantos s�o pares e //quantos s�o �mpares.

import java.util.Scanner;
public class repeti�ao_ex07_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num = 0, par = 0, impar = 0;

		for(int i = 0; i < 20; i++) {
			System.out.print( +(i+1)+ " - Digite um n�mero: ");
			num = leia.nextInt();
			
			if (num % 2 == 0){
				par++;
			}
			
			else{
				impar++;
			}
		}
		
		System.out.println("Quantidade de n�meros Pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);

		leia.close();
	}

}