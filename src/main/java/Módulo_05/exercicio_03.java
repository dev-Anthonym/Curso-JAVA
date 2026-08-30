package Módulo_05;

import java.util.Scanner;

public class exercicio_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.print("Digite um número: ");
		A = sc.nextInt();
		System.out.print("Digite mais número: ");
		B = sc.nextInt();
		System.out.println();
		
		if(A % B == 0) {
			System.out.println("Os números são múltiplos!");
		}
		else if (B % A == 0){
			System.out.println("Os números são múltiplos!");
		}
		else {
			System.out.println("Os números não são múltiplos!");
		}
		
		sc.close();
	}
}
