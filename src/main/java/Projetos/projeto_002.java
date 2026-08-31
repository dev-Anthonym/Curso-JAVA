package Projetos;

import java.util.Scanner;

public class projeto_002 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		double delta, x1, x2;
		
		System.out.println("Digite o valor de 'a': ");
		a = sc.nextInt();
		System.out.println("Digite o valor de 'b': ");
		b = sc.nextInt();
		System.out.println("Digite o valor de 'c': ");
		c = sc.nextInt();
		System.out.println();
		
		delta = Math.pow(b,  2.0) - 4*a*c;
		x1 = (-b -(Math.sqrt(delta))) / (2*a);
		x2 = (-b -(Math.sqrt(delta))) / (2*a);
		
		System.out.println("O valor de Delta é = " + delta);
		System.out.println();
		System.out.println("O valor de X1 = " + x1);
		System.out.println("O valor de X2 = " + x2);
		
		sc.close();
	}

}
