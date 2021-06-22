package com.wanderson.cursojava.labs01;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String letra;
		
		System.out.println("Digite uma letra");
		letra = input.next();
		
		verificarLetraVogal(letra);

	}
	
	public static void verificarLetraVogal(String letra) {
		switch (letra) {
			case "A":
			case "a":
			case "E":
			case "e":
			case "I":
			case "i":
			case "o":
			case "O":
			case "U":
				System.out.println("Vogal");
			break;
			default:
				System.out.println("Não é vogal");
		}
	}

}
