package Exercicios04;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = input.nextInt();

		}

		for (int i = 0; i < vetorB.length; i++) {

			System.out.println("Entre com um número para a posição " + i);
			vetorB[i] = input.nextInt();

			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else {
				vetorC[i] = -1;
			}

		}

		System.out.println("Vetor A = ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.println("Vetor B = ");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();

		System.out.println("Vetor C = ");

		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
