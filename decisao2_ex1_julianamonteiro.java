//1) Fa�a um algoritmo para ler um n�mero inteiro e informar //se este � maior que 10.
import java.util.Scanner;
public class decisao2_ex1_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.print("Digite um n�mero inteiro: ");
		numero = leia.nextInt();


		if(numero > 10){
			System.out.println("O n�mero digitado � maior que 10. ");
		}
		
		else {
			System.out.println("O n�mero digitado � MENOR que 10. :( ");
		}
		
		leia.close();
	}
}

		