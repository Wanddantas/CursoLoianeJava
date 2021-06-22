package com.wanderson.cursojava.labs01;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe M para Masculino e F para Feminino");
		s = input.next();
		
		verificarGenero(s);
		
	}
	
	public static void verificarGenero(String s) {
		
		if(s.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}else if(s.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}else {
			System.out.println("Genero inválido!");
		}
	}

}
