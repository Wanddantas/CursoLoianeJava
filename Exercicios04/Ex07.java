package Exercicios04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int elemento = 15;
		
		int[] vetorA = new int[elemento];
		int[] vetorB = new int[elemento];
		int[] vetorC = new int[elemento];
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe os 10 elementos do vetorA " + (i+1));
			vetorA[i] = input.nextInt();
			
			System.out.println("Informe os 10 elementos do vetorB " + (i+1));
			vetorB[i] = input.nextInt();
			
			vetorC[i] = vetorA[i] - vetorB[i];
			
		}
		
		for(int v : vetorC) {
			System.out.print(v + " ");
		}
		

	}

}
