/*
9) Receber n�meros e imprimir o triplo de cada n�mero digitado. O algoritmo acaba quando entrar o
numero 0.
*/
import java.util.Scanner;
public class repeti�ao_ex09_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;

		while (true) {
			System.out.println("Digite um n�mero: ");
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