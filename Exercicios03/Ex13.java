package Exercicios03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		
		System.out.println("Entre com a potencia");
		int pot = scan.nextInt();
		
		int resultado = base;
		
		for(int i = 1; i < pot; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado " + resultado);
		

	}

}
