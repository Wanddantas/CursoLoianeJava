package Exercicios04;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i < vetorA.length;i++) {
			
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = input.nextInt();
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
			
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
		
		System.out.println();

	}

}
