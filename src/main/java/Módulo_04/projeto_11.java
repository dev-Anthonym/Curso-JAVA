package Módulo_04;

import java.util.Scanner;

public class projeto_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Meu nome é: " + x);
		System.out.println("Eu tenho " + y + " anos de idade!");
		System.out.printf("Eu tenho %.2f m de altura!", z);
		
		sc.close();
	}
}
