package Exercicios04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int elemento = 10;
		int[] vetorA = new int[elemento];
		int[] vetorB = new int[elemento];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Informe os 15 elementos do vetorA " + (i + 1));
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] * i;

		}
		
		for(int v : vetorB) {
			System.out.print(v + " ");
		}

	}

}
