package JavaBasico;

import java.util.Scanner;

public class LIST22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner leia = new Scanner(System.in);
		        
		        System.out.println("Nome do colaborador:");
		        String nome = leia.nextLine();
		        System.out.println("Cargo (1 a 6):");
		        int codigoCargo = leia.nextInt();
		        System.out.println("Salário:");
		        float salario = leia.nextFloat();
		        float reajuste = 0;
		        String cargo = "";
		        
		        switch (codigoCargo) {
		            case 1:
		                cargo = "Gerente";
		                reajuste = 0.10f;
		                break;
		                
		            case 2:
		                cargo = "Vendedor";
		                reajuste = 0.07f;
		                break;
		                
		            case 3:
		                cargo = "Supervisor";
		                reajuste = 0.09f;
		                break;
		                
		            case 4:
		                cargo = "Motorista";
		                reajuste = 0.06f;
		                break;
		                
		            case 5:
		                cargo = "Estoquista";
		                reajuste = 0.05f;
		                break;
		                
		            case 6:
		                cargo = "Tecnico de TI";
		                reajuste = 0.08f;
		                break;
		                
		            default:
		                System.out.println("Código de cargo inválido.");
		        }
		        
		        float novoSalario = salario + (reajuste * salario);
		        
		        System.out.println("\nNome do colaborador: " + nome);
		        System.out.println("Cargo: " + cargo);
		        System.out.printf("Salário: R$ %.2f\n", novoSalario);
		        
		    }
	}
