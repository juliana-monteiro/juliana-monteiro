/*
8) Fa�a um programa que receba do usu�rio dois n�meros reais (a e b). Ap�s isso, o programa deve exibir na tela o seguinte menu:
Digite 1 para somar.
Digite 2 para subtrair.
Digite 3 para multiplicar.
Digite 4 para dividir.
Digite 5 para sair.
De acordo com a op��o do usu�rio, o programa vai imprimir na tela o resultado de a+b, a-b, a*b ou a/b.
*/
import java.util.Scanner;
public class decisao_ex08_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float a, b, c, soma = 0 , subtra�ao = 0 , 
				divisao = 0 , multiplica�ao = 0;

		System.out.print("Digite o 1� n�mero: ");
		a = leia.nextFloat();

		System.out.print("Digite o 2� n�mero: ");
		b = leia.nextFloat();

		System.out.println("Digite 1 para SOMAR. ");
		
		System.out.println("Digite 2 para SUBTRAIR. ");
		
		System.out.println("Digite 3 para MULTIPLICAR.. ");
		
		System.out.println("Digite 4 para DIVIDIR. ");
		
		System.out.println("Digite 5 para SAIR. ");
		c = leia.nextFloat();
		
		
		if(c == 1){
			soma = a + b;
			System.out.println("A soma dos dois n�meros �:  " + soma);
		}
			

		else if(c == 2){
			subtra�ao = a - b;
			System.out.println("A subtra�ao dos dois n�meros �:  " + subtra�ao);
		}
			

		else if (c == 3){
			multiplica�ao = a * b;
			System.out.println("A multiplica��o dos dois n�meros �:  " + multiplica�ao);

		}
			
		else if (c == 4){
			divisao = a / b;
			System.out.println("A divis�o dos dois n�meros �:  " + divisao);
		}
			
			
		else if (c == 5){
			System.out.println("Voc� digitou 5 e saiu do programa.  ");
		}
			
		leia.close();
	}
}