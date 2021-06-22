package Exercicios04;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];//parese e impares
		
		
		for(int i =0; i < vetorA.length;i++) {
			
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = input.nextInt();
			
		}
		
		int posB = 0;
		
		for(int i =0; i < vetorA.length;i++) {
			
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
			
		}
		
		for(int i =0; i < vetorA.length;i++) {
			
			if(vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
			
		}
		
		System.out.println("Vetor A = ");
		
		for(int i = 0; i < vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B = ");
		
		for(int i = 0; i < posB;i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();

	}

}
