/*
11) Entrar com n�meros positivos, um de cada vez, e imprimir a m�dia dos n�meros digitados. O
usu�rio deve informar um n�mero negativo para informar o final da sequ�ncia dos n�meros.
*/
import java.util.Scanner;
public class repeti�ao_ex11_julianamonteiro {

	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);

		float num, media = 0;
		int cont = 0;

		do{
			System.out.println("Digite um n�mero");
			num = leia.nextFloat();

			if(num >= 0){
				media += num ;
				cont++;
			}
		} 
		while(num >= 0);

		System.out.println("Finalizado");
		System.out.println("A quantidade de n�meros digitados foi " + cont);
		System.out.println("A m�dia � " + media / cont);

		leia.close();
	}
}
