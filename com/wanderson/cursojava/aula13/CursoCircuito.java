package com.wanderson.cursojava.aula13;

public class CursoCircuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro;// ele faz a comparação dos dois;
		boolean resultado2 = falso && 
				verdadeiro;// ele faz a comparação logica;
		System.out.println(resultado1); //falso
		System.out.println(resultado2); 
	
	}

}
