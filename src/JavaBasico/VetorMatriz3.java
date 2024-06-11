package JavaBasico;

import java.util.Scanner;

public class VetorMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] matriz = new int[3][3];

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento da posição "+i +","+j +": ");
                matriz[i][j] = leia.nextInt();
        }
        }
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }
        System.out.println("\nSoma dos Elementos da Diagonal Principal:");
        System.out.println(somaDiagonalPrincipal);
        System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
        System.out.println(somaDiagonalSecundaria);
        
		}
		}
