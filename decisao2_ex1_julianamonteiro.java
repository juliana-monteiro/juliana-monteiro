//1) Faça um algoritmo para ler um número inteiro e informar //se este é maior que 10.
import java.util.Scanner;
public class decisao2_ex1_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();


		if(numero > 10){
			System.out.println("O número digitado é maior que 10. ");
		}
		
		else {
			System.out.println("O número digitado é MENOR que 10. :( ");
		}
		
		leia.close();
	}
}

		