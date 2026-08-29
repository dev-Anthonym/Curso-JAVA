package Módulo_04;

import java.util.Locale; //Importanto a classe "Locale" para internacionalização e formatação regional automática. 

public class exercicio_01 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!"); //O comando "ln" é o comando que da a quebra de linha na saída do código.
		System.out.println("Bom dia!");
		
		int y = 32;
		double x = 10.35764;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // O comando " f("%.2f%n", ...) " após o "print" é para formatar o valor da variável, com quantas casas decimais desejadas.
		System.out.printf("%.4f%n", x); 
		Locale.setDefault(Locale.US);
		System.out.println("O resultado é "+y); // O operador "+" nesse caso ele está sendo usado em forma de concatenas uma frase "O resultado é " com uma variável "y".
		System.out.printf("O resultado é %.2f metros%n", x); // A variável "x" irá entrar no lugar do comendo "%.2f".
	}
}