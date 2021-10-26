/*
O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
calcular e escrever o custo final ao consumidor.
*/
import java.text.DecimalFormat;
import java.util.*;
public class exercicio5_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		float porcentagemDistribuidor, custoFabrica, impostos, custoFinal;
		
		System.out.print("Digite o valor de f�brica do carro: ");
		custoFabrica = leia.nextFloat();
		
		impostos = custoFabrica * 0.45f;
		porcentagemDistribuidor = custoFabrica*0.28f;
		custoFinal = custoFabrica + porcentagemDistribuidor + impostos;
		
		System.out.println("=================================================================== ");
		System.out.println("Custo de f�brica: " + df.format(custoFabrica));
		System.out.println("Impostos aplicados ao custo de f�brica: " + df.format(impostos));
		System.out.println("Porcentagem do distribuidor aplicado ao custo de f�brica : " + df.format(porcentagemDistribuidor));
		System.out.println("=================================================================== ");
		System.out.println("Valor final do carro para o consumidor: " + df.format(custoFinal));

		leia.close();
	}
	
}