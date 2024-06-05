package JavaBasico;

import java.util.Scanner;

public class EXE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nnumero1: ");
		n1 = leia.nextFloat();
		System.out.println("\nnumero2: ");
		n2 = leia.nextFloat();
		System.out.println("\nnumero3: ");
		n3 = leia.nextFloat();
		System.out.println("\nnumero4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2) - (n3*n4);
		
		System.out.println("\nDiferença: "+diferenca);
	}

}
