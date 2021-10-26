//1)Verificar se um número informado pelo usuário é par ou //impar.
import java.util.Scanner;
public class decisao_ex01_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();

		if(numero % 2 == 0){
			System.out.println("É par!");
		}
			

		else {
			System.out.println("É ímpar!");
		}
			
		leia.close();
	}
}