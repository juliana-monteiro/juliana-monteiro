/*
2)Receber do usu�rio um n�mero e verificar se ele est� entre 0 e 10,inclusive.
*/
import java.util.Scanner;
public class decisao_ex02_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();

		if(numero >= 0 && numero <=10){
			System.out.println("OK!!! N�mero est� entre 0 e 10");
		}
			

		else{
			System.out.println("ERRO!!! Digite um n�mero entre 0 e 10");
		}
			
		leia.close();
	}
}