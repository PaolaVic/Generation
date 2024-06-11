package JavaBasico;

import java.util.Collections;

import java.util.ArrayList;

import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();

        System.out.println("Digite 5 cores:");
        for (int i = 0; i < 5; i++) {
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("Todas as Cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nCores Ordenadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }
		}
		}
