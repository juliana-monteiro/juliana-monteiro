/*
Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.
*/
import java.text.DecimalFormat;
import java.util.*;
public class exercicio4_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		float salarioAtual, percentualReajuste,calculoReajuste, salarioReajustado; 
		
		System.out.print("Digite o salário mensal atual: ");
		salarioAtual = leia.nextFloat();
		
		System.out.print("Digite a porcentagem de aumento: ");
		percentualReajuste = leia.nextFloat();
		
		System.out.println("==================================== ");
		
		calculoReajuste = (salarioAtual*percentualReajuste)/100;
		salarioReajustado = salarioAtual + calculoReajuste;
		
		System.out.println("O salário reajustado ficou: " + df.format(salarioReajustado) );
		
		leia.close();

	}

}
