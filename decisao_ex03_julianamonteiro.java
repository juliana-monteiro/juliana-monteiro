//3)Receber do usu�rio 3 n�mero e exibir o maior deles.
import java.util.Scanner;
public class decisao_ex03_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("Digite o 1� n�mero: ");
		num1 = leia.nextInt();

		System.out.print("Digite o 2� n�mero: ");
		num2 = leia.nextInt();

		System.out.print("Digite o 3� n�mero: ");
		num3 = leia.nextInt();

		if((num1>num2) && (num1>num3)){
			System.out.print("O maior n�mero foi: " +num1);
		}
		
		else if ((num2>num1) && (num2>num3)){
			System.out.print("O maior n�mero foi: " +num2);
		}
		
		else if ((num3>num1)&& (num3>num2)){
			System.out.println("O maior n�mero foi: " +num3);
		}
		
		leia.close();
	}
}