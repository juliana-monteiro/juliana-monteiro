/*
7) A prefeitura de Cafundodojudas abriu uma linha de credito para os funcion�rios. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. Fazer um algoritmo onde o usu�rio informa seu sal�rio bruto e o valor da presta��o e o programa exibe na tela se o empr�stimo pode ou n�o
ser concedido.
*/
import java.util.Scanner;
public class decisao_ex07_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float bruto, presta�ao, vlmaximo;

		System.out.print("Digite seu sal�rio bruto: ");
		bruto = leia.nextFloat();

		System.out.print("Digite o valor da presta��o: ");
		presta�ao = leia.nextFloat();

		vlmaximo = (bruto/100)*30;

		if(presta�ao <= vlmaximo){
			System.out.println("Empr�stimo pode ser concedido. ");
		}
		
		else {
			System.out.println("Empr�stimo N�O pode ser concedido. :( ");
		}
		
		leia.close();
	}
}
