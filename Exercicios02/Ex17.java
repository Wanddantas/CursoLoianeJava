package Exercicios02;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o ano: ");
		
		int ano = input.nextInt();
		
		if((ano % 400 == 0) ||(ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("É bissexto");
		}else{
			System.out.println("não é bissexto");
		}

	}

}
