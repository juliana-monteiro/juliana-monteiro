/*
Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. Calcular e escrever o valor do novo sal�rio.
*/
import java.text.DecimalFormat;
import java.util.*;
public class exercicio4_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		float salarioAtual, percentualReajuste,calculoReajuste, salarioReajustado; 
		
		System.out.print("Digite o sal�rio mensal atual: ");
		salarioAtual = leia.nextFloat();
		
		System.out.print("Digite a porcentagem de aumento: ");
		percentualReajuste = leia.nextFloat();
		
		System.out.println("==================================== ");
		
		calculoReajuste = (salarioAtual*percentualReajuste)/100;
		salarioReajustado = salarioAtual + calculoReajuste;
		
		System.out.println("O sal�rio reajustado ficou: " + df.format(salarioReajustado) );
		
		leia.close();

	}

}
