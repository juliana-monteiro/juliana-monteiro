/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.
*/
import java.text.DecimalFormat;
import java.util.*;
public class exercicio5_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		float porcentagemDistribuidor, custoFabrica, impostos, custoFinal;
		
		System.out.print("Digite o valor de fábrica do carro: ");
		custoFabrica = leia.nextFloat();
		
		impostos = custoFabrica * 0.45f;
		porcentagemDistribuidor = custoFabrica*0.28f;
		custoFinal = custoFabrica + porcentagemDistribuidor + impostos;
		
		System.out.println("=================================================================== ");
		System.out.println("Custo de fábrica: " + df.format(custoFabrica));
		System.out.println("Impostos aplicados ao custo de fábrica: " + df.format(impostos));
		System.out.println("Porcentagem do distribuidor aplicado ao custo de fábrica : " + df.format(porcentagemDistribuidor));
		System.out.println("=================================================================== ");
		System.out.println("Valor final do carro para o consumidor: " + df.format(custoFinal));

		leia.close();
	}
	
}