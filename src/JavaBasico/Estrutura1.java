package JavaBasico;

import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

public class Estrutura1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Queue<String> filaClientes = new LinkedList<>();
			Scanner leia = new Scanner(System.in);
        
			int opcao;
			do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila:");
            System.out.println("2: Listar todos os Clientes:");
            System.out.println("3: Retirar um cliente da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            
            switch (opcao) {
            case 1:
            System.out.print("Digite o nome do Cliente: ");
            String nome = leia.nextLine();
            filaClientes.add(nome);
            System.out.println("\nFila: \n" + filaClientes);
            System.out.println("Cliente Adicionado!");
            break;
            
            case 2:
            System.out.println("\nLista de Clientes na Fila: \n" + filaClientes);
            break;
            
            case 3:
            if (filaClientes.isEmpty()) {
            System.out.println("\nA Fila está vazia!");
            } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("\nFila: \n" + filaClientes);
            System.out.println("O Cliente " + clienteChamado + " foi Chamado!");
            }
            break;
            
            case 0:
            System.out.println("\nPrograma Finalizado!");
            break;
            default:
            System.out.println("\nOpção inválida! Digite novamente.");
            }
			} while (opcao != 0);
			}
			}
