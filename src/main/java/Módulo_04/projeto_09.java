package Módulo_04;

import java.util.Locale;
import java.util.Scanner;

public class projeto_09 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n", x);
		
		sc.close();
	}
}
