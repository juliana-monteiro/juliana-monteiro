/*
8) Faça um programa que receba do usuário dois números reais (a e b). Após isso, o programa deve exibir na tela o seguinte menu:
Digite 1 para somar.
Digite 2 para subtrair.
Digite 3 para multiplicar.
Digite 4 para dividir.
Digite 5 para sair.
De acordo com a opção do usuário, o programa vai imprimir na tela o resultado de a+b, a-b, a*b ou a/b.
*/
import java.util.Scanner;
public class decisao_ex08_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float a, b, c, soma = 0 , subtraçao = 0 , 
				divisao = 0 , multiplicaçao = 0;

		System.out.print("Digite o 1º número: ");
		a = leia.nextFloat();

		System.out.print("Digite o 2º número: ");
		b = leia.nextFloat();

		System.out.println("Digite 1 para SOMAR. ");
		
		System.out.println("Digite 2 para SUBTRAIR. ");
		
		System.out.println("Digite 3 para MULTIPLICAR.. ");
		
		System.out.println("Digite 4 para DIVIDIR. ");
		
		System.out.println("Digite 5 para SAIR. ");
		c = leia.nextFloat();
		
		
		if(c == 1){
			soma = a + b;
			System.out.println("A soma dos dois números é:  " + soma);
		}
			

		else if(c == 2){
			subtraçao = a - b;
			System.out.println("A subtraçao dos dois números é:  " + subtraçao);
		}
			

		else if (c == 3){
			multiplicaçao = a * b;
			System.out.println("A multiplicação dos dois números é:  " + multiplicaçao);

		}
			
		else if (c == 4){
			divisao = a / b;
			System.out.println("A divisão dos dois números é:  " + divisao);
		}
			
			
		else if (c == 5){
			System.out.println("Você digitou 5 e saiu do programa.  ");
		}
			
		leia.close();
	}
}