package com.wanderson.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5; i++) {
			System.out.println("I tem valor: " + i);
		}
		
		for(int i = 5; i >= 0; i--) {
			System.out.println("I tem valor: " + i);
		}
		
		for(int i = 0, j = 10;i < j; i++,j--) {
			System.out.println("i = " + i + "; j= " + j);
		}
		
		int count = 0;
		
		for(;count < 10;) {
			System.out.println("Valor de count: " + count);
			count +=2;
		}
		
		for(int cont = 0; cont < 10; cont +=2) {
			System.out.println("Valor de cont: " + cont);
		}
		
		int soma = 0;
		
		for(int i = 0; i < 5;soma += i++);
		System.out.println("O valor da soma � " + soma);
		
		for(int i = 0; i < 5; i++) 
			System.out.println("I tem valor: " + i);
		

	}

}
