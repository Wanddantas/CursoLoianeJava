package com.wanderson.cursojava.aula14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Entre com a idade");
//		int idade = scan.nextInt();
//		
//		if(idade >= 18) {
//			//executa se condi��o for verdadeira
//			System.out.println("� maior de idade");
//			
//		} else {
//			System.out.println("N�o � maior de idade");
//			//executa se condi��o false
//		}
		
		//barato <= 10
		//10 < valor < 15 - pedir desconto
		// 15<= valor 17 - pesqauisar mais
		//>= 17 muito caro
		
		System.out.println("Digite um valor: ");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Est� barato, pode comprar ");
		}else if (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto");
		}else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais");
		}else {
			System.out.println("Muito caro");
		}
		System.out.println("Fim do programa");
	}

}
