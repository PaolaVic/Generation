package JavaBasico;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Luana Sousa";
		int idade = 29;
		float altura = 1.5f,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSeu nome é: "+nome);
		System.out.println("\nVocê viveu: "+idade+" anos de vida");
		System.out.println("\nSua altura é: "+altura);
	
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		System.out.println("\nA sua média foi de: "+media);
		System.out.printf("\nSua média foi de: %.2f",media);
		
		nota1 = (float) Math.pow(nota2,3);
		nota2 = (float) Math.sqrt(nota3);
		
		int a=2, b=8;
		a = b % a;
		// char resp = 'S';
		/*
		 * blablabla
		 * jgjjghhgjfhg
		 * gfgfhgfhggh
		 */
	}

}
