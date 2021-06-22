package Exercicios04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int qtdV = 15;
		
		int[] vetorA = new int[qtdV];
		int[] vetorB = new int[qtdV];
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe os 15 elementos do vetorA " + (i+1));
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
			
		}
		
		for(int result : vetorB) {
			System.out.print(result + " ");
		}
		

	}

}
