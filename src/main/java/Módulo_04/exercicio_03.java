package Módulo_04;

import java.util.Scanner;

public class exercicio_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		System.out.print("Digite um 1º valor: ");
		A = sc.nextInt();
		System.out.print("Digite um 2º valor:" );
		B = sc.nextInt();
		System.out.print("Digite um 3º valor: ");
		C = sc.nextInt();
		System.out.print("Digite um 3º valor: ");
		D = sc.nextInt();
		
		dif = (A * B) - (C *D);
		
		System.out.println("A diferença entre o produto A e B entre o produto de C e D é: "+ dif);
		
		sc.close();
	}
}
