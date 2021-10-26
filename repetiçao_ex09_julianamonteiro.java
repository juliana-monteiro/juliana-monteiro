/*
9) Receber números e imprimir o triplo de cada número digitado. O algoritmo acaba quando entrar o
numero 0.
*/
import java.util.Scanner;
public class repetiçao_ex09_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;

		while (true) {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if(n==0) {
				System.out.println("Finalizado");
				break;
			}
			
			System.out.println("Resultado: " + n*3);
		}
		
		leia.close();
	}

}