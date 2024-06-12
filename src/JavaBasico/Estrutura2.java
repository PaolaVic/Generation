package JavaBasico;

import java.util.Scanner;

import java.util.Stack;

public class Estrutura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Stack<String> pilhaLivros = new Stack<>();
	        Scanner leia = new Scanner(System.in);
	        
	        int opcao;
	        do {
	        exibirMenu();
	        opcao = leia.nextInt();
	            
	        switch (opcao) {
	        case 1:
	        adicionarLivro(pilhaLivros, leia);
	        break;
	                    
	        case 2:
	        listarLivros(pilhaLivros);
	        break;
	                    
	        case 3:
	        retirarLivro(pilhaLivros);
	        break;
	                    
	        case 0:
	        System.out.println("\nPrograma Finalizado!");
	        break;
	                    
	        default:
	        System.out.println("\nOpção inválida! Digite novamente.");
	        }
	        } while (opcao != 0);
	    	}
	    
	    	public static void exibirMenu() {
	        System.out.println("\nMenu:");
	        System.out.println("1: Adicionar um novo livro na biblioteca: ");
	        System.out.println("2: Listar todos os livros da biblioteca: ");
	        System.out.println("3: Retirar um livro: ");
	        System.out.println("0: Finalizar o programa");
	        System.out.print("Digite uma opção: ");
	    	}
	    
	    	public static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
	        System.out.print("Digite o nome do livro: ");
	        String livro = scanner.nextLine();
	        pilhaLivros.push(livro);
	        System.out.println("\nPilha: \n" + pilhaLivros);
	        System.out.println("Livro adicionado!");
	    	}
	    
	    	public static void listarLivros(Stack<String> pilhaLivros) {
	        System.out.println("\nLista de Livros na Pilha: \n" + pilhaLivros);
	    	}
	    
	    	public static void retirarLivro(Stack<String> pilhaLivros) {
	        if (pilhaLivros.isEmpty()) {
	            System.out.println("\nA Pilha está vazia!");
	        } else {
	            String livroRetirado = pilhaLivros.pop();
	            System.out.println("\nPilha: \n" + pilhaLivros);
	            System.out.println("O Livro \"" + livroRetirado + "\" foi retirado da pilha!");
	        }
	    	}
			}
