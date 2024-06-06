package JavaBasico;

import java.util.Scanner;

public class LISTA23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
        float n1 = leia.nextFloat();
        System.out.println("Digite o segundo numero:");
        float n2 = leia.nextFloat();
        System.out.println("Operação (1 a 4):");
        int operacao = leia.nextInt();
        
        float resultado = 0;
        switch (operacao) {
            case 1:
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
                break;
                
            case 2:
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
                break;
                
            case 3:
                resultado = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resultado);
                break;
                
            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
                break;
                
            default:
                System.out.println("Operação Inválida!");
                break;
        }
        
}
	}