package Exercicios03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero para gerar a tabuada");
		int num = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
		
	}

}
