/*
5. Faça um programa que lê uma matriz 3 × 3 e imprime o determinante da matriz.
*/
import java.util.Scanner;

public class vetoresmatrizes02_ex05_julianamonteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int determinante = 0;
		int diagPrin1, diagPrin2, diagPrin3;
		int diagSec1, diagSec2, diagSec3;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Informe o " + (i + 1) + " º valor da " + (j + 1) + " ª linha: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		// Diagonais principais
		diagPrin1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
		diagPrin2 = matriz[0][1] * matriz[1][2] * matriz[2][0];
		diagPrin3 = matriz[0][2] * matriz[1][0] * matriz[2][1];
		// Diagonais secundarias
		diagSec1 = matriz[2][0] * matriz[1][1] * matriz[0][2];
		diagSec2 = matriz[2][1] * matriz[1][2] * matriz[0][0];
		diagSec3 = matriz[2][2] * matriz[1][0] * matriz[0][1];
		// Determinante
		determinante = -(diagSec1 + diagSec2 + diagSec3) + (diagPrin1 + diagPrin2 + diagPrin3);
		
		System.out.print("===================================" );
		System.out.print("Determinante da matriz é:  " + determinante);
		leia.close();
	}

}
