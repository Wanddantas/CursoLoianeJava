package Exercicios03;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double preco;
		double soma = 0;
		double media = 0;
		
		System.out.println("Entre com o número de CDs:");
		int cds = input.nextInt();
		
		for(int i =1; i <= cds; i++) {
			System.out.println("Informe o valor do cd" + i);
			preco = input.nextDouble();
			
			soma += preco;
		}
		
		media = soma/cds;
		
		System.out.println("Média gasta com cada CD:" + media);
	}

}
