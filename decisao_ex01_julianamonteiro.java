//1)Verificar se um n�mero informado pelo usu�rio � par ou //impar.
import java.util.Scanner;
public class decisao_ex01_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();

		if(numero % 2 == 0){
			System.out.println("� par!");
		}
			

		else {
			System.out.println("� �mpar!");
		}
			
		leia.close();
	}
}