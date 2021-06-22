package com.wanderson.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite seu nome Completo:");
//		String nomeCompleto = scan.nextLine();
//		
//		System.out.println("Seu nome Completo é: " + nomeCompleto);
//		
//		System.out.println("Digite seu First name: ");
//		String firstName = scan.next();
//		System.out.println("Primeiro nome é " + firstName);
//		
//		System.out.println("Digite sua idade: ");
//		int idade = scan.nextInt();
//		System.out.println("Sua idade é " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura: " + altura);

	}

}
