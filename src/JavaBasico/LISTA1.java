package JavaBasico;

import java.util.Scanner;

public class LISTA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o número A:");
        int A = leia.nextInt();
        
        System.out.println("Digite o número B:");
        int B = leia.nextInt();
        
        System.out.println("Digite o número C:");
        int C = leia.nextInt();
        
        int soma = A + B;
        
        System.out.println(A + " + " + B + " = " + soma);
        
        if (soma > C) {
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < C) {
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println("A Soma de A + B é Igual a C");
        }
        
    }
	}

