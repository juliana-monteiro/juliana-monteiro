//3)Receber do usuário 3 número e exibir o maior deles.
import java.util.Scanner;
public class decisao_ex03_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("Digite o 1º número: ");
		num1 = leia.nextInt();

		System.out.print("Digite o 2º número: ");
		num2 = leia.nextInt();

		System.out.print("Digite o 3º número: ");
		num3 = leia.nextInt();

		if((num1>num2) && (num1>num3)){
			System.out.print("O maior número foi: " +num1);
		}
		
		else if ((num2>num1) && (num2>num3)){
			System.out.print("O maior número foi: " +num2);
		}
		
		else if ((num3>num1)&& (num3>num2)){
			System.out.println("O maior número foi: " +num3);
		}
		
		leia.close();
	}
}