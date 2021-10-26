/*
Criar uma agenda telefônica que salva nome, e-mail e número de telefone. Faça o seguinte
menu:
Digite:
1-Para armazenar um novo contato
2-Listar todos os contatos
3-Buscar contato por nome
4-Sair
Os dados deverão ser armazenados em um vetor.
*/
import java.util.Scanner;

public class AUTOINSTRUCIONAL_JULIANAMONTEIRO {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String numTelefone[] = new String[100];
		String nome[] = new String[100];
		String email[] = new String[100];
		int menu, novoCadastro = 0;

		do {
			System.out.println("=================MENU================= ");
			System.out.println("1- Para armazenar um novo contato. ");
			System.out.println("2- Listar todos os contatos. ");
			System.out.println("3- Buscar contato por nome. ");
			System.out.println("4- Sair. ");
			System.out.println("Agora digite a opção desejada:");
			System.out.println("====================================== ");
			menu = leia.nextInt();

			if (menu == 1) {
				for (; novoCadastro < 10; novoCadastro++) {
					leia.nextLine();
					System.out.print("Digite o nome: ");
					nome[novoCadastro] = leia.nextLine();
					System.out.print("Digite o telefone: ");
					numTelefone[novoCadastro] = leia.nextLine();
					System.out.print("Digite o email: ");
					email[novoCadastro] = leia.nextLine();
					System.out.println("====================================== ");
					System.out.println("Deseja salvar novo contato? S/N ");
					System.out.println("====================================== ");
					char sair = leia.next().toUpperCase().charAt(0);
					if (sair == 'N') {
						novoCadastro++;
						break;
					}

				}

			}

			else if (menu == 2) {
				if (nome[0] == null) {
					System.out.println("Ainda NÃO existe contato salvo :-(");
					System.out.println("É necessário armazenar contato!\n");
				} else {
					for (int i = 0; i < novoCadastro; i++) {
						System.out.println("Nome: " + nome[i]);
						System.out.println("Telefone: " + numTelefone[i]);
						System.out.println("Email:  " + email[i]);
						System.out.println("====================================== \n");

					}
				}

			}

			else if (menu == 3) {

				if (nome[0] == null) {
					System.out.println("Ainda NÃO existe contato salvo :-(");
					System.out.println("É necessário armazenar contato!\n");
				} else {
					leia.nextLine();
					System.out.println("Digite o nome a ser procurado: ");
					String pesquisa = leia.nextLine();
					System.out.println("====================================== \n ");
					int i;
					for (i = 0; i < novoCadastro; i++) {

						if (pesquisa.equalsIgnoreCase(nome[i])) {
							System.out.println("Nome: " + nome[i]);
							System.out.println("Telefone: " + numTelefone[i]);
							System.out.println("Email:  " + email[i]);
							System.out.println("====================================== \n ");
							break;
						}

					}
					if (i == novoCadastro) {
						System.out.println("NÃO EXISTE CADASTRO COM ESSE NOME :-( \n");
					}

				}
			}

			else if (menu == 4) {
				System.out.println("======= PROGRAMA FINALIZADO!!! ======= ");
			}

			else {
				System.out.println("    ====== OPÇÃO INVÁLIDA! ====== \n");
			}

		} while (menu != 4);

		leia.close();
	}
}
