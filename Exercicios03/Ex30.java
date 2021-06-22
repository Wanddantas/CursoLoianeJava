package Exercicios03;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean invalido = true;
		int inicio,finalTabuada;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número para gerar a tabuada");
		int num = scan.nextInt();
		
		
		
		do {
			
			System.out.println("Entre com o início da Tabuada");
			inicio = scan.nextInt();
			
			System.out.println("Entre com o final da Tabuada");
			finalTabuada = scan.nextInt();
			
			if(finalTabuada > inicio) {
				invalido = false;
			}
			
		}while(invalido);
		
		System.out.println("Tabuada de " + num + ":" );
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em: " + finalTabuada);
		System.out.println();
		
		for(int i = inicio; i <= finalTabuada; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
		
		

	}

}
