package JavaBasico;

import java.util.Scanner;

public class LaçoForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
        
        int numero = 0, somaPositivos = 0;
        
        do {
        System.out.println("Digite um número:");
        numero = leia.nextInt();
            
        if (numero > 0) {
        somaPositivos += numero;
        }
        } while (numero != 0);
        
        System.out.println("\nA soma dos números positivos é: " + somaPositivos);
        }
	    }
