package JavaBasico;

import java.util.Scanner;

public class LaçoFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		int n1, n2;

		System.out.printf("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.printf("Digite o último número do intervalo: ");
		n2 = leia.nextInt();

		if (n1 > n2) {
		System.out.println("Intervalo inválido!");
		} else {
		
		System.out.println("No intervalo entre "+n1+"e"+n2);
		for (int i = n1; i <= n2; i++) {
		if (i % 3 == 0 && i % 5 == 0) {
		
		System.out.println(i + " é múltiplo de 3 e 5");
		}
		}
		}
		}
		}
