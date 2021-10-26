/*
6)Receber do usuário seu peso e altura, calcular o IMC (Índice de Massa
Corporal). Exiba na tela qual a classificação da pessoa de acordo com a
seguinte tabela:
IMC CLASSIFICAÇÃO
MENOR QUE 18,5 MAGREZA
ENTRE 18,5 E 24,9 NORMAL
ENTRE 25,0 E 29,9 SOBREPESO
ENTRE 30,0 E 39,9 OBESIDADE
MAIOR QUE 40,0 OBESIDADE GRAVE
Utilize a seguinte fórmula: IMC = peso / altura2
*/
import java.util.Scanner;
public class decisao_ex06_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float peso, altura, imc;

		System.out.print("Digite seu peso: ");
		peso = leia.nextFloat();

		System.out.print("Digite sua altura: ");
		altura = leia.nextFloat();

		imc = peso / (altura*altura);

		if(imc < 18.5){
			System.out.println("Seu IMC tem Classificação: Magreza. ");
		}
		
		else if(imc > 18.5 && imc < 24.9){
			System.out.println("Seu IMC tem Classificação: Normal. ");
		}
			
		else if(imc > 25.0 && imc < 29.9){
			System.out.println("Seu IMC tem Classificação: Sobrepeso. ");
		}
		
		else if(imc > 30.0 && imc < 39.9){
			System.out.println("Seu IMC tem Classificação: Obesidade. ");
		}
		
		else if (imc > 40.0){
			System.out.println("Seu IMC tem Classificação: Obesidade Grave. ");
		}
		
		leia.close();
	}
}