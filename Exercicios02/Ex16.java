package Exercicios02;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Entre com o valor de A: ");
		int a = input.nextInt();
		
		if(a == 0) {
			System.out.println("Não é equação de segundo grau");
		}else {
			
		System.out.println("Entre com o valor de B: ");
		int b = input.nextInt();
		
		System.out.println("Entre com o valor de C: ");
		int c = input.nextInt();
		
		double delta = (b * b) - (4*a*c);
		
		if(delta < 0) {
			System.out.println("Delta negativo");
		}else {
			
			double x1 = ((-b) + Math.sqrt (delta)) / (2*a);
			double x2 = ((-b) - Math.sqrt (delta)) / (2*a);
			
			System.out.println("Valor de Delta" + delta);
			
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);
		}
		
		}
		
	}

}
