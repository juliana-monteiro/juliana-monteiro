/*
Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o valor 20 em uma vari�vel B.
A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que o
valor que est� em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
nas vari�veis.
*/
public class exercicio1_julianamonteiro {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int aux;
		System.out.println("Antes o valor de A era: "+a+" e o valor de B era: "+b);
		aux=a;
		a=b;
		b=aux;
		System.out.println("================================================= ");
		System.out.println("Agora o valor de A �: "+a+" e o valor de B �: "+b);

	}

}
