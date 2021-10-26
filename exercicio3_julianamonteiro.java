/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
*/
import java.util.*;
public class exercicio3_julianamonteiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, idadeTotal;
		
		System.out.print("Digite sua idade: (anos) ");
		idadeAnos= leia.nextInt();
		
		System.out.print("Digite sua idade: (meses) ");
		idadeMeses= leia.nextInt();
		
		System.out.print("Digite sua idade: (dias) ");
		idadeDias= leia.nextInt();
		
		System.out.println("=================================== ");
		
		
		idadeTotal= (idadeAnos*365)+(idadeMeses*30)+ idadeDias ;
		
		System.out.println("Idade total expressa em dias: "+idadeTotal);
		
		leia.close();
	}

}
