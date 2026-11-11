package Módulo_05;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Esse núemro é PAR!");
		}
		else {
			System.out.println("Esse número é ÍMPAR");
		}
		
		sc.close();
	}
	
}
