/*
5)Receba do aluno o valor de 3 provas, calcule a m�dia aritm�tica entre elas e
exiba na tela se o aluno foi aprovado ou reprovado. Obs: um aluno �
aprovado se sua nota for maior ou igual a 6.
*/
import java.util.Scanner;
public class decisao_ex05_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float nota1, nota2, nota3, media;

		System.out.print("Digite a 1� nota: ");
		nota1 = leia.nextFloat();

		System.out.print("Digite a 2� nota: ");
		nota2 = leia.nextFloat();

		System.out.print("Digite a 3� nota: ");
		nota3 = leia.nextFloat();

		media = (nota1+ nota2+ nota3)/3;

		if(media >= 6)
			System.out.println("Parab�ns!!! Voc� foi aprovado! ");
		

		else 
			System.out.println("Voc� foi reprovado! :( ");
		
		leia.close();
	}
}