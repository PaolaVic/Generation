package JavaBasico;

import java.util.Scanner;

public class LaçoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, TotalMenoresDe21 = 0, TotalMaioresDe50 = 0;
        
       Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite uma idade:");
        idade = leia.nextInt();
        
        while (idade >= 0) {
        if (idade < 21) {
        TotalMenoresDe21++;
        } if (idade > 50) {
        TotalMaioresDe50++;
        }
            
        System.out.println("Digite uma idade:");
        idade = leia.nextInt();
        }
        
        System.out.println("\nTotal de pessoas menores de 21 anos: " + TotalMenoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + TotalMaioresDe50);
		}
		}
