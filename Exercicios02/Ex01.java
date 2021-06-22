package Exercicios02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input();
		
	}
	
	static void input(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, Informe o primeiro número:");
		int num = scan.nextInt();
		
		System.out.println("Por favor, Informe o Segundo número:");
		int num2 = scan.nextInt();
		
		valorNum(num, num2);
		
	}
	
	static void valorNum(int num, int num2) {
		if(num > num2) {
			System.out.println("O valor " + num + " É maior ");
		}else if (num == num2) {
			System.out.println("O valor é igual");
		}else if(num2 > num) {
			System.out.println("O valor " + num2 + " É maior");
		}else {
			System.out.println("Informe um valor válido");
		}
	}

}
