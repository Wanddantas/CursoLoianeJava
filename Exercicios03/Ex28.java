package Exercicios03;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero ");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("N�o � primo - divis�vel por " + i);
				primo = false;
			}
		}
		
		if(primo) {
		System.out.println("� numero primo");
		}
	}
	
	}


