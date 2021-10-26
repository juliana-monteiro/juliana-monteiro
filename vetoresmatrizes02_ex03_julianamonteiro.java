/*
3. Uma frase/palavra é dita ser palíndrome, se ela é a mesma se lida da esquerda para a
direita é a mesma que lida da direita para a esquerda. Faça um programa que lê uma
cadeia de caracteres e diz se a cadeia é palindrome ou não.
*/
import java.util.Scanner;

public class vetoresmatrizes02_ex03_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String palavra;
		String contrario = "";

		System.out.print("Digite uma palavra para verificar se ela é palíndromo: ");
		palavra = leia.nextLine();

		for (int i = (palavra.length() - 1); i >= 0; i--) {
			contrario += palavra.charAt(i);
		}
		if (contrario.equals(palavra)) {
			System.out.print("A palavra " + palavra + " é palíndromo! ");
		} else {
			System.out.print("A PALAVRA " + palavra + " NÃO É PALÍNDROMO :-( ");
		}
		leia.close();
	}

}
