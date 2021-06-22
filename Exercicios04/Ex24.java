package Exercicios04;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i < vetorA.length;i++) {
			
			System.out.println("Entre com um número para a posição " + (i+1));
			vetorA[i] = input.nextInt();
			
		}
		
		boolean palindromo = true;
		
		for(int i=0; i < vetorA.length;i++) {
			
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.println("Vetor A = ");
		
		for(int i = 0; i < (vetorA.length/2);i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		if(palindromo) {
			System.out.println("Palindromo");
		}else {
			System.out.println("Não é Palindromo");
		}

	}

}
