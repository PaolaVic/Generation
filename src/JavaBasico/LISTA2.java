package JavaBasico;


import java.util.Scanner;

public class LISTA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		 System.out.println("Digite um numero:");
	        int numero = leia.nextInt();
	        
	        if (numero % 2 == 0) {
	            System.out.print("O Numero " + numero + " é par");
	        } else {
	            System.out.print("O Numero " + numero + " é ímpar");
	        }
	        
	        if (numero > 0) {
	            System.out.println(" é positivo!");
	        } else if (numero < 0) {
	            System.out.println(" é negativo!");
	        }
	        
	    }
	}