package Exercicios03;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de n");
		int n = input.nextInt();
		double soma = 0;
		
		for(int i = 1, j=1; i <= n; i++,j += 2) {
			System.out.print(i + "/" + j + " + ");
			soma += i/j;
		}
		
		System.out.println("Soma = " + soma);


	}

}
