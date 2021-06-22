package Exercicios04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int elemento = 10;
		
		int soma = 0;
		
		int[] vetorA = new int[elemento];
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe o primeiro valor " + (i+1));
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		
		System.out.println(soma);

	}

}
