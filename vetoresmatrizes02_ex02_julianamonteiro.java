/*
2. Fa�a um programa que l� uma cadeia de caracteres e transforma a cadeia de caracteres
na mesma cadeia, mas com as letras transformadas para min�sculas. Em seguida imprime a
cadeia de caracteres resultante.
*/
import java.util.Scanner;

public class vetoresmatrizes02_ex02_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		char frase[] = new char[5];
		char caracter[] = new char[5];
		char var;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um caracter em mai�scula: ");
			frase[i] = leia.next().charAt(0);
			var = Character.toLowerCase(frase[i]);
			caracter[i] = var;
		}
		System.out.print("Sua frase em min�scula �: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(caracter[i]);
		}
		leia.close();
	}

}
