package Módulo_04;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id;
		double hrstrb, salhr, sal;
		
		System.out.print("Digite o ID de funcionário: ");
		id = sc.nextInt();
		System.out.print("DIgite o total de horas trabalhada no mês atual: ");
		hrstrb = sc.nextDouble();
		System.out.print("Digite qual o valor da hora desse funcionário: ");
		salhr = sc.nextDouble();
		System.out.println("---------------------------------------");
		
		sal = hrstrb * salhr;
		
		System.out.println("Funcionário: " + id);
		Locale.setDefault(Locale.US);
		System.out.printf("Salário U$ %.2f%n", sal);
		
		sc.close();
	}
}
