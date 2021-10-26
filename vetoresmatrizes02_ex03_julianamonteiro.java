/*
3. Uma frase/palavra � dita ser pal�ndrome, se ela � a mesma se lida da esquerda para a
direita � a mesma que lida da direita para a esquerda. Fa�a um programa que l� uma
cadeia de caracteres e diz se a cadeia � palindrome ou n�o.
*/
import java.util.Scanner;

public class vetoresmatrizes02_ex03_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String palavra;
		String contrario = "";

		System.out.print("Digite uma palavra para verificar se ela � pal�ndromo: ");
		palavra = leia.nextLine();

		for (int i = (palavra.length() - 1); i >= 0; i--) {
			contrario += palavra.charAt(i);
		}
		if (contrario.equals(palavra)) {
			System.out.print("A palavra " + palavra + " � pal�ndromo! ");
		} else {
			System.out.print("A PALAVRA " + palavra + " N�O � PAL�NDROMO :-( ");
		}
		leia.close();
	}

}
