/*
8) Receber N n�meros positivos e imprimir a m�dia dos n�meros digitados. No in�cio do programa o
usu�rio deve informar o valor de N.
*/
8) Receber N n�meros positivos e imprimir a m�dia dos n�meros digitados. No in�cio do programa o
usu�rio deve informar o valor de N.
*/
import java.util.Scanner;
public class repeti�ao_ex08_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n, numero, media = 0;

		System.out.print("Quantos n�meros voc� quer somar?: ");
		n = leia.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) +"� n�mero: ");
			numero = leia.nextInt();
			media += numero;

		}

		System.out.println("A m�dia �: " + (float) media/n);

		leia.close();
	}

}