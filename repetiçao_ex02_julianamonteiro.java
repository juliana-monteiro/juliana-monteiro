/*
2)Criar um algoritmo que imprima a soma dos n�meros pares em um intervalo fornecido pelo usu�rio.
*/
import java.util.Scanner;
public class repeti�ao_ex02_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int sum = 0, ini = 0, fim = 0;

		System.out.println("Digite o in�cio do intervalo" );
		ini = leia.nextInt();
		System.out.println("Digite o final do intervalo");
		fim = leia.nextInt();

		for(int i = ini; i <= fim; i ++) {
			if(i % 2 == 0){
				sum += i;
			}

		}
		System.out.println("Soma dos n�meros pares: " + sum);
		leia.close();
	}
}