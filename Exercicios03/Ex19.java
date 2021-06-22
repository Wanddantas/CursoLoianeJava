package Exercicios03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de notas: ");
		int notas = scan.nextInt();
		
		double soma = 0;
		double media = 0;
		double nota;
		
		for(int i =0; i < notas; i++) {
			System.out.println("Entre com a nota " + (i+1));
			nota = scan.nextDouble();
			
			soma += nota;
		}
		
		media = soma /notas;
		
		System.out.println(" soma: " + soma);
		System.out.println(" Média " + media);
	}

}
