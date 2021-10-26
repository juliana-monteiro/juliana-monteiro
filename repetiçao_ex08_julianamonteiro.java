/*
8) Receber N números positivos e imprimir a média dos números digitados. No início do programa o
usuário deve informar o valor de N.
*/
8) Receber N números positivos e imprimir a média dos números digitados. No início do programa o
usuário deve informar o valor de N.
*/
import java.util.Scanner;
public class repetiçao_ex08_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n, numero, media = 0;

		System.out.print("Quantos números você quer somar?: ");
		n = leia.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) +"º número: ");
			numero = leia.nextInt();
			media += numero;

		}

		System.out.println("A média é: " + (float) media/n);

		leia.close();
	}

}