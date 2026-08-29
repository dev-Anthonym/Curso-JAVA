package Módulo_04;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		System.out.println("Digite outro número: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("A soma dos números digitados é: "+ soma);
		
		sc.close();
	}
}