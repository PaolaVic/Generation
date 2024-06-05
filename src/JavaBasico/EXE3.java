package JavaBasico;

import java.util.Scanner;

public class EXE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

float salariobruto, adicionalnoturno, horasextras, descontos, salarioliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSalário Bruto: ");
		salariobruto = leia.nextFloat();
		System.out.println("\nAdicional Noturno: ");
		adicionalnoturno = leia.nextFloat();
		System.out.println("\nHoras Extras: ");
		horasextras = leia.nextFloat();
		System.out.println("\nDescontos: ");
		descontos = leia.nextFloat();
		
		salarioliquido = salariobruto + adicionalnoturno + (horasextras*5) - descontos;
		
		System.out.println("\nSalário Líquido: "+salarioliquido);
	}

}
