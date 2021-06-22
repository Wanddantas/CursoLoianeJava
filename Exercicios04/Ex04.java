package Exercicios04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		
		int[] vetorB = new int[15];
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Informe os 15 elementos do vetorA " + (i+1));
			vetorA[i] = input.nextInt();
			
			vetorB[i] = (int) Math.sqrt(vetorA[i]);
			
		}
		
		//DecimalFormat df = new DecimalFormat("###,###.##");
		
		for(int raiz : vetorB) {
			
			System.out.print(raiz + " ");
			
		}
		
	}

}
