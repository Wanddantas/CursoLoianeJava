package Exercicios04;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int elemento = 10;
		
		int[] vetorA = new int[elemento];
		
		int cont = 0;
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe a " + (i+1) + " idade: ");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] > 35) {
				cont++;
			}
			
		}
		
		System.out.println("Quantidade de pessoas que tem a idade superior a 35 anos. São " + cont + " pessoas ");

	}

}
