package Exercicios04;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i =0; i < vetorA.length;i++) {
			
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = input.nextInt();
			
		}
		
	for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Tabuada de " + vetorA[i]);
			
	for(int j = 1; j <=10;j++) {
			System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));
	}
		System.out.println();
			
		}

	}

}
