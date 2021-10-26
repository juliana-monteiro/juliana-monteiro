/*
Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.
*/
import java.text.DecimalFormat;
import java.util.*;
public class exercicio6_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		int carrosVendidos;
		float totalVendas, salarioFixo, comissaoFixa, 
		comissaoTotVendas, ComissaoPorCarroVendido, salarioFinal;
		
		System.out.print("Digite o salário fixo: ");
		salarioFixo = leia.nextFloat();
		
		System.out.print("Digite a comissão fixa por carro vendido: ");
		comissaoFixa = leia.nextFloat();
		
		System.out.print("Digite a quantidade de carros vendidos: ");
		carrosVendidos = leia.nextInt();
		
		System.out.print("Digite o valor total das vendas: ");
		totalVendas = leia.nextFloat();
		
		System.out.println("=================================================================== ");
		
		ComissaoPorCarroVendido = comissaoFixa*carrosVendidos;
		comissaoTotVendas = totalVendas * 0.05f;
		salarioFinal = salarioFixo + ComissaoPorCarroVendido + comissaoTotVendas;
		
		System.out.println("Salário fixo do vendedor: " + df.format(salarioFixo));
		System.out.println("Total da comissão por carro vendido: " + df.format(ComissaoPorCarroVendido));
		System.out.println("Comissão pelo total de vendas: " + df.format(comissaoTotVendas));
		System.out.println("=================================================================== ");

		System.out.println("Salário final do vendedor: " + df.format(salarioFinal));

		leia.close();

	}

}
