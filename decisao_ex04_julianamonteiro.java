//4)Verificar se a letra digitada pelo usuário é vogal ou //consoante.
import java.util.Scanner;
public class decisao_ex04_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		char letra;

		System.out.print("Digite uma letra: ");
		letra = leia.next().charAt(0);;


		if(letra == 'a' || letra == 'A'){
			System.out.println("Esta letra é uma vogal! ");
		}
			
		else if (letra == 'e' || letra == 'E'){
			System.out.println("Esta letra é uma vogal! ");
		}
			
		else if (letra == 'i' || letra == 'I'){
			System.out.println("Esta letra é uma vogal! ");
		}
			
		else if (letra == 'o' || letra == 'O'){
			System.out.println("Esta letra é uma vogal! ");
		}
		
		else if (letra == 'u' || letra == 'U'){
			System.out.println("Esta letra é uma vogal! ");
		}
		
		else {
			System.out.println("Esta letra é uma consoante! ");
		}
		
		leia.close();
	}
}
