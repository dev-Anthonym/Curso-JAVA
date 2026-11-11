package Módulo_05;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("Este número é NEGATIVO");
		} 
		else {
			System.out.println("Este número é POSITIVO");
		}
		
		sc.close();
	}
}
