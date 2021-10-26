/*
11) Entrar com números positivos, um de cada vez, e imprimir a média dos números digitados. O
usuário deve informar um número negativo para informar o final da sequência dos números.
*/
import java.util.Scanner;
public class repetiçao_ex11_julianamonteiro {

	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);

		float num, media = 0;
		int cont = 0;

		do{
			System.out.println("Digite um número");
			num = leia.nextFloat();

			if(num >= 0){
				media += num ;
				cont++;
			}
		} 
		while(num >= 0);

		System.out.println("Finalizado");
		System.out.println("A quantidade de números digitados foi " + cont);
		System.out.println("A média é " + media / cont);

		leia.close();
	}
}
