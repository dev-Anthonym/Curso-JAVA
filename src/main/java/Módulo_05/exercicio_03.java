package Módulo_05;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite um número inteiro: ");
		A = sc.nextInt();
		System.out.println("Digite mais um número inteiro: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Esses dois número SÃO MÚLTIPLOS entre si!");
		}
		else {
			System.out.println("Esses dois número NÃO SÃO MÚLTIPLOS entre si!");
		}
		
		sc.close();
	}
}
