package Módulo_05;

import java.util.Scanner;

public class exercicio_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Este número é par.");
		}
		else {
			System.out.println("Esse número é ímpar.");
		}
		
		sc.close();
	}
}
