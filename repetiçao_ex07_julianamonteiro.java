//7) Ler 20 números inteiros e imprimir quantos são pares e //quantos são ímpares.

import java.util.Scanner;
public class repetiçao_ex07_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num = 0, par = 0, impar = 0;

		for(int i = 0; i < 20; i++) {
			System.out.print( +(i+1)+ " - Digite um número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0){
				par++;
			}
			
			else{
				impar++;
			}
		}
		
		System.out.println("Quantidade de números Pares: " + par);
		System.out.println("Quantidade de números Ímpares: " + impar);

		leia.close();
	}

}