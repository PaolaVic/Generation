package JavaBasico;

import java.util.Scanner;

public class EXE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float nota1, nota2, nota3, nota4, media;
		
		Scanner print = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = print.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = print.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = print.nextFloat();
		System.out.println("\nEntre com a quarta nota: ");
		nota4 = print.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA sua média é: %.1f",media);
	}

}
