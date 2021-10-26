/*
crie uma repeti�ao para receber a digita��o dos 5 nomes para gravar no vetor. criar uma repeti�ao que receba a digita�ao aleatoria de nomes enquanto o usuario assim desejar. criar uma outra repeti�ao para pesquisar o nome digitado no vetor. comparar o nome digitado com o primeiro elemento do vetor. se for igual o elemento procurado foi encontrado. caso contrario avan�a para o proximo elemento do vetor.se nao for encontrado nenhum nome no vetor igual ao nome digitado informar que nao existe o elemento pesquisado.
*/
import java.util.Scanner;

public class vetores_matrizes_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome[] = new String[5];
		String procura;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + " � nome: ");
			nome[i] = leia.nextLine();
		}
		do {
			System.out.println("======================================================= ");
			System.out.println("Digite um nome a ser procurado (digite fim para sair): \n");
			procura = leia.nextLine();
			if (procura.equalsIgnoreCase("FIM")) {
				System.out.println("      ========== Programa finalizado!!! ============");
				break;
			}
			int i;
			for (i = 0; i < 5; i++) {
				if (procura.equalsIgnoreCase(nome[i])) {
					procura = nome[i];
					System.out.print("    ====== O Nome foi encontrado na posi��o " + (i + 1) + " ======\n");
					break;
				}
			}
			if (i == 5) {
				System.out.println("    ======= N�O FOI ENCONTRADO ESSE NOME :-( ======= \n");
			}

		} while (true);

		leia.close();
	}

}
