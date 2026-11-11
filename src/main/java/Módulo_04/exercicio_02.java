package Módulo_04;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double pi, raio, area;
		
		System.out.print("Digite um valor apra representar o raio da circunferência: ");
		raio = sc.nextDouble();
		System.out.println();
		
		pi = 3.14159;
		area = pi * (Math.pow(raio, 2));
		
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da área da circunferência é %.4f|%n", area);
		
		sc.close();
	}
}
