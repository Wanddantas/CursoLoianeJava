package com.wanderson.cursojava.aula18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor da contagem: ");
		int primeiro = input.nextInt();
		
		System.out.println("Entre com o valor máximo da contagem: ");
		int maximo = input.nextInt();
		
		for(int i = primeiro; i <= maximo;i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				
				System.out.println("O Número divisível por 7:" + i);
				break;
			}
			
		}

	}

}
