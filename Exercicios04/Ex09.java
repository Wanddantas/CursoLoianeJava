package Exercicios04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int qtdElemento = 10;
		
		int[] vetorA = new int[qtdElemento];
		int[] vetorB = new int[qtdElemento];
		int[] vetorC = new int[qtdElemento];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Informe os 10 elementos do vetorA " + (i+1));
			vetorA[i] = input.nextInt();
			
			System.out.println("Informe os 10 elementos do vetorB " + (i+1));
			vetorB[i] = input.nextInt();
			
			vetorC[i] = (int) vetorA[i] / vetorB[i];
			
		}
		
		for(int v : vetorC) {
			System.out.print(v + " ");
		}

	}

}
