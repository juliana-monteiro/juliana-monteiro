/*
01) Fazer um algoritmo que imprima os n�meros de 1 a 100 e depois de 100 at� 1.
*/
import java.util.Scanner;
public class repeti�ao_ex01_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		 for(int i=1; i<=100; i++){
             System.out.print(i+" - " );
        }
        System.out.print("\n");
       
        for(int x=100; x>=1; x--){
            System.out.print(x+" - ");
        }
         leia.close();
         
    }
}