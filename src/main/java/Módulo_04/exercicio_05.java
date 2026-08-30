package Módulo_04;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double val1, val2, total;
		
		System.out.print("Digite o código da peça: ");
		cod1 = sc.nextInt();
		System.out.print("Digite quantidade da peça: ");
		qtd1 = sc.nextInt();
		System.out.print("Digite o valor da peça: ");
		val1 = sc.nextDouble();
		System.out.println();
		
		System.out.print("Digite o código da peça: ");
		cod2 = sc.nextInt();
		System.out.print("Digite quantidade da peça: ");
		qtd2 = sc.nextInt();
		System.out.print("Digite o valor da peça: ");
		val2 = sc.nextDouble();
		System.out.println();
		
		total = (val1 * qtd1) + (val2 * qtd2);
		
		System.out.printf("VALOR A PAGAR DA PEÇA %d E %d: R$ %.2f%n", cod1, cod2, total);
		
		sc.close();
	}
}
