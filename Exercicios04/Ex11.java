package Exercicios04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int elemento = 10;
		
		int[] vetorA = new int[elemento];
		
		int qtdPares = 0;
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe o valor " + (i+1));
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			}
		}
		System.out.println(qtdPares);

	}

}
