
package JavaBasico;


import java.util.Scanner;

public class LISTA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		String nome, resposta;
		int idade;
		boolean doacao = false;

		System.out.printf("Digite o nome do doador: ");
		nome = leia.nextLine();
		System.out.printf("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("É sua primeira vez doando sangue? S/N");
		leia.nextLine();
		resposta = leia.nextLine();

		if (resposta.equalsIgnoreCase("S")) {
			doacao = true;
		} else {
			doacao = false;
		}
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69 && doacao == false) {
				System.out.println("O doador está apto(a) para fazer a doação de sangue!");
			} else {
				System.out.println("O doador não está apto(a) para fazer a doação de sangue!");
			}
		} else {
			System.out.println("O doador não possuí idade suficiente para doar sangue!");
		}
	}
}