package JavaBasico;

import java.util.Scanner;

public class EXE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario, abono, novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salario: ");
		salario = leia.nextDouble();
		System.out.println("\nDigite o abono: ");
		abono = leia.nextDouble();
		
		novosalario = abono +salario;
		
		System.out.println("\nO seu novo salario é: "+novosalario);
	}

}
