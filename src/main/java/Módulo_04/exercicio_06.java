package Módulo_04;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_06 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, tri, cir, tra, qua, ret, pi;
		
		pi = 3.14159;
		
		System.out.print("Digite um valor para A: ");
		A = sc.nextDouble();
		System.out.print("Digite um valor para B: ");
		B = sc.nextDouble();
		System.out.print("Digite um valor para C: ");
		C = sc.nextDouble();
		System.out.println();
		
		tri = (A * C) / 2;
		cir = pi * Math.pow(C, 2);
		tra = ((A * B) * C) / 2;
		qua = Math.pow(B, 2);
		ret = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f%n", tri);
		System.out.printf("CÍRCULO: %.3f%n", cir);
		System.out.printf("TRAPÉZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		sc.close();
	}
}
