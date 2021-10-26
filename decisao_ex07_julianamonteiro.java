/*
7) A prefeitura de Cafundodojudas abriu uma linha de credito para os funcionários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo onde o usuário informa seu salário bruto e o valor da prestação e o programa exibe na tela se o empréstimo pode ou não
ser concedido.
*/
import java.util.Scanner;
public class decisao_ex07_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float bruto, prestaçao, vlmaximo;

		System.out.print("Digite seu salário bruto: ");
		bruto = leia.nextFloat();

		System.out.print("Digite o valor da prestação: ");
		prestaçao = leia.nextFloat();

		vlmaximo = (bruto/100)*30;

		if(prestaçao <= vlmaximo){
			System.out.println("Empréstimo pode ser concedido. ");
		}
		
		else {
			System.out.println("Empréstimo NÃO pode ser concedido. :( ");
		}
		
		leia.close();
	}
}
