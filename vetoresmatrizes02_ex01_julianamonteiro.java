/*
1) Fa�a um programa que l� as notas de n alunos, cada nota � um inteiro entre 0 e 100, e
imprima a quantidade de vezes com que apareceu uma determinada nota digitada pelo
usu�rio.
*/
import java.util.Scanner;

public class vetoresmatrizes02_ex01_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n = 0, i, pesquisa;

		System.out.print("Quantas notas deseja digitar?: ");
		n = leia.nextInt();
		int notas[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Digite a " + (i + 1) + " � nota entre 0 e 100: ");
			notas[i] = leia.nextInt();
		}

		do {
			System.out.println("======================================================= ");
			System.out.println("Digite um n�mero a ser pesquisado (digite -1 para sair): \n");
			pesquisa = leia.nextInt();
			if (pesquisa == -1) {
				System.out.println("      ========== Programa finalizado!!! ============");
				break;
			}
			for (i = 0; i < n; i++) {
				if (pesquisa == notas[i]) {
					pesquisa = notas[i];
					System.out.print("    ====== O n�mero foi encontrado na posi��o " + (i + 1) + " ======\n");
					break;
				}
			}
			if (i == n) {
				System.out.println("    ======= N�O FOI ENCONTRADO ESSE N�MERO :-( ======= \n");
			}
		} while (true);

		leia.close();
	}

}
