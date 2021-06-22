package Exercicios04;

import java.util.Scanner;



public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double[] vetorA = new double[20];
		
		Scanner input = new Scanner(System.in);
		
		double cotacaoDoDollar = 2.93;
		
		for(int i = 0; i < vetorA.length;i++) {
			
			vetorA[i] = cotacaoDoDollar * i;
			
		}
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("posição: " + (i+1) + " Valor do dollar: " + vetorA[i]);
			
		}
	}

}
