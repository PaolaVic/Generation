package JavaBasico;

import java.util.Scanner;

public class LIST21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int codigo, quantidade;
		float valorTotal;
		
		System.out.println("1 - Cachorro Quente - R$ 10.00");
		System.out.println("2 - X-Salada - R$ 15.00");
		System.out.println("3 - X-Bacon - R$ 18.00");
		System.out.println("4 - X-Tudo - R$ 30.00");
		System.out.println("5 - Bauru - R$ 12.00");
		System.out.println("6 - Refrigerante - R$ 8.00");
		System.out.println("7 - Suco de laranja - R$ 13.00");

		System.out.printf("\nSelecione o código do seu pedido: ");
		codigo = leia.nextInt();
		System.out.printf("\nSelecione a quantidade: ");
		quantidade = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			valorTotal = (int) (quantidade * 10.0);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		case 2:
			System.out.println("Produto: X-Salada");
			valorTotal = (int) (quantidade * 15.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		case 3:
			System.out.println("Produto: X-Bacon");
			valorTotal = (int) (quantidade * 18.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 4:
			System.out.println("Produto: X-Tudo");
			valorTotal = (int) (quantidade * 30.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		case 5:
			System.out.println("Produto: Bauru");
			valorTotal = (int) (quantidade * 12.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		case 6:
			System.out.println("Produto: Refrigerante");
			valorTotal = (int) (quantidade * 8.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		case 7:
			System.out.println("Produto: Suco de Laranja");
			valorTotal = (int) (quantidade * 13.00);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
	}

	}
