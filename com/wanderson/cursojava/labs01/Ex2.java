package com.wanderson.cursojava.labs01;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Informe um valor: ");
		num = scan.nextInt();
		
		verificarNegatico(num);

	}
	
	public static void verificarNegatico(int num) {
		
		if(num < 0) {
			System.out.println("O número informado é negativo " + num);
		}else {
			System.out.println("O número é positivo " + num);
		}
		
	}

}
