package com.wanderson.cursojava.aula18;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor da contagem: ");
		int primeiro = input.nextInt();
		
		System.out.println("Entre com o valor m�ximo da contagem: ");
		int maximo = input.nextInt();
		
		for(int i = primeiro; i <= maximo;i++) {
			
			if(i % 7 == 0) {
				continue; // Realiza a interea��o novamente do loop e n�o executa o c�digo abaixo.
			}
			
			System.out.println(i);
		}

	}

}
