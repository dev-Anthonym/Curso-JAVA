package Módulo_05;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hrini, hrfin, duracao;
		
		System.out.println("Que horas começou o jogo?");
		hrini = sc.nextInt();
		System.out.println("Que horas terminou o jogo?");
		hrfin = sc.nextInt();
		
		if (hrini < hrfin) {
			duracao = hrfin - hrini;
		}
		else {
			duracao = 24 - hrini + hrfin;
		}
		
		System.out.println("O jogo durou " + duracao + " Hora(s)");
		
		sc.close();
	}
	
}
