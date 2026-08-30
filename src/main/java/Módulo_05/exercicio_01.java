package Módulo_05;

import java.util.Scanner;

public class exercicio_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Este número é negativo.");
		}
		else {
			System.out.println("Esse número é positivo.0");
		}
		
		sc.close();
	}
}
