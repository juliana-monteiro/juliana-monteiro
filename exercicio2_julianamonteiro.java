/*
Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.
*/

import java.util.*;

public class exercicio2_julianamonteiro {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int base,altura, areaRetangulo;
		
		System.out.print("Digite a base do ret�ngulo: ");
	     base = leia.nextInt();
	     
	    System.out.print("Digite a altura do ret�ngulo: ");
	     altura = leia.nextInt();
	     
	     System.out.println("============================= ");
	     
	     areaRetangulo= base*altura;
	     
	     System.out.println("A �rea do ret�ngulo �: "+areaRetangulo);
	     
	     leia.close();
	}
}
