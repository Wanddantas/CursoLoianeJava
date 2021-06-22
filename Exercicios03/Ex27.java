package Exercicios03;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a qtd de temperaturas: ");
		int qtdTemperaturas = scan.nextInt();
		
		double temp;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for(int i = 1; i <= qtdTemperaturas; i++) {
			System.out.println("Entre com a temperatura" + i);
			temp = scan.nextDouble();
			
			soma +=temp;
			
			if(temp > maior) {
				maior = temp;
			}
			
			if(temp < menor) {
				menor = temp;
			}
			
		}
		
		System.out.println("Média: " + (soma/qtdTemperaturas));
		System.out.println("Menor Temperatura " + menor);
		System.out.println("Maior Temperatura " + maior);
	}

}
