package Exercicios03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número ");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i < num; i++) {
			if(num % 1 == 0) {
				System.out.println("Não é primo");
				primo = false;
			}
		}
		
		if(primo) {
		System.out.println("É numero primo");
		}
	}

}
