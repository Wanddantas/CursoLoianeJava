package Exercicios04;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
	
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe os valores de vetor A " + (i+1));
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			} else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else if(vetorA[i] > 10) {
				vetorB[i] = 'e';
			} 
		
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
