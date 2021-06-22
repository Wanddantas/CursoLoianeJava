package Exercicios02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	
	static void input() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero 1");
		int num1 = input.nextInt();
		System.out.println("Digite o numero 2");
		int num2 = input.nextInt();
		System.out.println("Digite o numero 3");
		int num3 = input.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("O numero " + num1 + " É maior");
		}else if(num2 >= num1 && num2 >= num3){
			System.out.println("O numero " + num2 + " É maior");
		}else if(num3 >= num1 && num3 >= num2) {
			System.out.println("O numero " + num3 + " É maior");
		}else {
			System.out.println("É igual");
		}		
	
	}

}
