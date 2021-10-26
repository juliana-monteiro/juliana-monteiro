/*
10) Chico tem 1,50m e cresce 1 cm por ano, enquanto Juca tem 1,10m e cresce 4 cm por ano. Construir
um algoritmo que calcule e imprima quantos anos ser�o necess�rios para que Juca seja maior que
Chico. Mostre tamb�m as alturas de Juca e Chico quando isso acontecer.
*/
public class repeti�ao_ex10_julianamonteiro {

	public static void main(String[] args) {
		
		float chico = 1.5f, juca = 1.1f, anos = 0;

		while (juca <= chico) {
			chico += 0.01 ;
			juca += 0.04;
			anos ++;
		}

		System.out.println("Ser� necess�rio " + anos + " anos para Juca ficar maior do que Chico.");
		System.out.println("Altura de Chico ser�: " + chico +" m");
		System.out.println("Altura de Juca ser�: " + juca + " m");

	}

}