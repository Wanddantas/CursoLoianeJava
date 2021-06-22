package Exercicios04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe 8 elementos para array de inteiros:");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] * 2;
			
		}
		
		for(int v : vetorB) {
			System.out.print(v + ",");
		}

	}

}
