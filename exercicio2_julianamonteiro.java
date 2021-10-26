/*
Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
*/

import java.util.*;

public class exercicio2_julianamonteiro {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int base,altura, areaRetangulo;
		
		System.out.print("Digite a base do retângulo: ");
	     base = leia.nextInt();
	     
	    System.out.print("Digite a altura do retângulo: ");
	     altura = leia.nextInt();
	     
	     System.out.println("============================= ");
	     
	     areaRetangulo= base*altura;
	     
	     System.out.println("A área do retângulo é: "+areaRetangulo);
	     
	     leia.close();
	}
}
