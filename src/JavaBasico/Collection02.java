package JavaBasico;

import java.util.HashSet;

import java.util.Iterator;

import java.util.Scanner;

import java.util.Set;

public class Collection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner(System.in);
	        Set<Integer> numeros = new HashSet<>();

	        System.out.println("Digite 10 valores inteiros não repetidos:");
	        for (int i = 0; i < 10; i++) {
	            int valor = leia.nextInt();
	            numeros.add(valor);
	        }

	        System.out.println("\nListar dados do Set:");
	        Iterator<Integer> iterator = numeros.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
			}
			}
