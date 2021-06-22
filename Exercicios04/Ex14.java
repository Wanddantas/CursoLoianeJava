package Exercicios04;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int elemento = 10;

		int[] vetorA = new int[elemento];
		
		int media = 0,soma = 0;
		int contImpares = 0;
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe o primeiro valor " + (i+1));
			vetorA[i] = input.nextInt();
			
			
			
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				contImpares++;
			}
			
		}
		
		media = soma/contImpares;
		
		System.out.println(media);

	}

}
