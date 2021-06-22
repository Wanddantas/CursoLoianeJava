package Exercicios04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int elemento = 10;
		
		int[] vetorA = new int[elemento];
		int soma = 0;
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe o primeiro valor " + (i+1));
			vetorA[i] = input.nextInt();
			soma += vetorA[i];
		}
		
		System.out.println(soma);

	}

}
