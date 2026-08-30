package Módulo_04;

import java.util.Locale;

public class projeto_01 {
	
	public static void main(String[] args) {
		 
		System.out.print("Hello World!"); // O comando "ln" é o comando que da a quabra de linha na saída do código.
		System.out.print("Bom dia!");
		
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // O comando " f("%.2f%n", ...) " após o "print" é para formatar o valor da variável, com quantas casas decimais desejadas.
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println("O resultado é "+y); // O operador "+" nesse caso ele está sendo usado em forma de concatenar uma frase "O resultado é " com uma variável "y".
		System.out.printf("O resultado é %.2f metros%n", x); // A variável "x" irá entrar no lugar do comando "%.2f".
	}
}
