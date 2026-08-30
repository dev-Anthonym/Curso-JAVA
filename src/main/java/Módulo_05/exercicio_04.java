package Módulo_05;

import java.util.Scanner;

public class exercicio_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hrinc, hrfnl, duracao;
		
		System.out.println("Que horas o jogo começou? ");
		hrinc = sc.nextInt();
		System.out.println("Que hora o jogo terminou? ");
		hrfnl = sc.nextInt();
		System.out.println();
		
		if(hrinc < hrfnl) {
			duracao = hrfnl - hrinc;
		}
		else {
			duracao = 24 - hrinc + hrfnl;
		}
		
		System.out.println("O jogo teve " + duracao + " horas de duração.");
		
		sc.close();
	}
}
