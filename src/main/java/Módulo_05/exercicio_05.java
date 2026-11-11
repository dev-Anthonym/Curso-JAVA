package Módulo_05;

import java.util.Scanner;

public class exercicio_05 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cod, qtd;
		double total;
		
		System.out.println("Escolha o código de um item: ");
		cod = sc.nextInt();
		System.out.println("Escolha a quantidade desse item: ");
		qtd = sc.nextInt();
		
		if (cod == 1) {
			total = qtd * 4.0;
		}
		else if (cod == 2) {
			total = qtd * 4.5;
		}
		else if (cod == 3) {
			total = qtd * 5.0;
		}
		else if (cod == 4) {
			total = qtd * 2.0;
		}
		else {
			total = qtd * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
