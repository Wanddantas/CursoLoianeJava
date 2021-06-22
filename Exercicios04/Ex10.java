package Exercicios04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int qtdElemento = 10;
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[qtdElemento];
		int[] vetorB = new int[qtdElemento];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Informe os 10 elementos do vetorA " + (i+1));
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
			
		}
		
		for(int v : vetorB) {
			System.out.print(v + " ");
		}

	}

}
