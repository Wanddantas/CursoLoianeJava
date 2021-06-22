package Exercicios04;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = input.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
			
		}
		
		System.out.println("Vetor A = ");
		
		for(int i = 0; i < vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B = ");
		
		for(int i = 0; i < vetorB.length;i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
