package Exercicios04;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length;i++) {
			
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 != 0) {
				break;
			}
			
		}

	}

}
