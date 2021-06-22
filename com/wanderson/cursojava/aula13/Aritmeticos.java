package com.wanderson.cursojava.aula13;

public class Aritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 1 + 2;
		
		System.out.println(resultado);
		
		resultado = resultado - 1;
		
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é ";
		String segundoNome = "uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		System.out.println(resultado++);//5
		//mesma coisa
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println(++resultado);
		//mesma coisa que
		//resultado +=1;
		//Sysout(resultado)
	}

}
