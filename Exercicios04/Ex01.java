package Exercicios04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int [] vetorA = new int[5];
		
		int [] vetorB = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Informe 5 números para array");
			
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		for(int v: vetorB) {
			System.out.print(v + " ");
		}
		

	}

}
