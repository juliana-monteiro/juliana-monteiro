/*
6)Crie um programa que pergunta o sexo de 30 pessoas e exibe na tela quantos são do sexo masculino e
quantos são do sexo feminino.
*/
import java.util.Scanner;
public class repetiçao_ex06_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int sexo = 0, fem = 0, masc = 0;

		for(int i = 0; i < 30; i++) {
			System.out.print( +(i+1)+ " Digite o sexo (0 para Feminino e 1 para Masculino): ");
			sexo = leia.nextInt();
			if (sexo == 0){
				fem++;

			}

			if (sexo == 1){
				masc++;

			}

		}
		System.out.println("Quantidade do Sexo Feminino: " + fem);
		System.out.println("Quantidade do Sexo Masculino: " + masc);

		leia.close();
	}

}