package Exercicios03;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de n: ");
		int n = input.nextInt();
		
		double soma = 0;
		
		for(int i =1; i <= n; i++) {
			soma += 1/i;
		}
		
		System.out.println("Soma = " + soma);
		
	}

}
