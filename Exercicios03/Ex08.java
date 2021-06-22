package Exercicios03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int soma = 0;
		int media;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i <5; i++) {
			System.out.println("Digite um número ");
			num = scan.nextInt();
			soma += num;
			}
		
		media = soma/5;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
