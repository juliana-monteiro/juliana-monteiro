/*
1) Faça um programa que lê as notas de n alunos, cada nota é um inteiro entre 0 e 100, e
imprima a quantidade de vezes com que apareceu uma determinada nota digitada pelo
usuário.
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
			System.out.print("Digite a " + (i + 1) + " ª nota entre 0 e 100: ");
			notas[i] = leia.nextInt();
		}

		do {
			System.out.println("======================================================= ");
			System.out.println("Digite um número a ser pesquisado (digite -1 para sair): \n");
			pesquisa = leia.nextInt();
			if (pesquisa == -1) {
				System.out.println("      ========== Programa finalizado!!! ============");
				break;
			}
			for (i = 0; i < n; i++) {
				if (pesquisa == notas[i]) {
					pesquisa = notas[i];
					System.out.print("    ====== O número foi encontrado na posição " + (i + 1) + " ======\n");
					break;
				}
			}
			if (i == n) {
				System.out.println("    ======= NÃO FOI ENCONTRADO ESSE NÚMERO :-( ======= \n");
			}
		} while (true);

		leia.close();
	}

}
