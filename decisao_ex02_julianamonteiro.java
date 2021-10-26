/*
2)Receber do usuário um número e verificar se ele está entre 0 e 10,inclusive.
*/
import java.util.Scanner;
public class decisao_ex02_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();

		if(numero >= 0 && numero <=10){
			System.out.println("OK!!! Número está entre 0 e 10");
		}
			

		else{
			System.out.println("ERRO!!! Digite um número entre 0 e 10");
		}
			
		leia.close();
	}
}