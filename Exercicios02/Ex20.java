package Exercicios02;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		String opcao;
		
		int pontos = 0;
		
		
		System.out.println("Por favor,responda as perguntas sobre o crime! s ou n");
		
		
		System.out.println("Telefonou para vítima? ");
		opcao = input.next(); 
		
		if(opcao.equals("s") ) {
			pontos = pontos + 1;
		}
		
		System.out.println("Esteve no local do crime? ");
		opcao = input.next(); 
		
		if(opcao.equals("s") ) {
			pontos = pontos + 1;
		}
		
		System.out.println("Devia para vítima ? ");
		opcao = input.next(); 
		
		if(opcao.equals("s") ) {
			pontos = pontos + 1;
		}
		
		System.out.println("Mora perto da vítima? ");
		opcao = input.next();  
		
		if(opcao.equals("s") ) {
			pontos = pontos + 1;
		}
		
		System.out.println("Já trabalhou com a vítima? ");
		opcao = input.next();  
		
		if(opcao.equals("s") ) {
			pontos = pontos + 1;
		}
		
		System.out.println(pontos);
		
		if(pontos == 2) {
			System.out.println("Suspeito");
		}else if(pontos >= 3 && pontos <= 4) {
			System.out.println("Cúmplice");
		}else if(pontos > 4) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}
		
		

	}
	

}
