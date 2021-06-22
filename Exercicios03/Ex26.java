package Exercicios03;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		System.out.print("Fatorial de " + num);
		
		System.out.println("! = ");
		
		int fatorial = 1;
		
		for(int i = num; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}

		System.out.print(" 1 = " + fatorial);
	}
}