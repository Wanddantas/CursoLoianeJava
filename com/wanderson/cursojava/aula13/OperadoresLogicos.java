package com.wanderson.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado = (valor1 ==1) && (valor2 ==2);
		System.out.println(resultado);
		
		boolean resultado2 = (valor1 ==1) || (valor2 ==2);
		System.out.println(resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso); //falso
		System.out.println(verdadeiro || falso); // verdadeiro
		System.out.println(verdadeiro ^ falso);  // verdadeiro
		System.out.println(!verdadeiro && falso); // falso

	}

}
