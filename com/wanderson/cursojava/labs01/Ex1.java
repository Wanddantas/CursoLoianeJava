package com.wanderson.cursojava.labs01;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;

		
		
		System.out.println("Entre com um número:");
		num = input.nextInt();
		
		System.out.println("Entre com um número:");
		num2 = input.nextInt();
		
		
		verificarNumero(num, num2);
		

	}
	
	public static void verificarNumero(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("O número " + num1 + " é maior");
		}else if(num2 > num1){
			System.out.println("O número " + num2 + " é maior");
		}else  {
			System.out.println("O número é igual");
		}
	}

}
