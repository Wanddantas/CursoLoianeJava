package Exercicios03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		boolean valido = false;
		double popA,popB,taxaA,taxaB;
				
			do {
				
				System.out.println("Entre com a Popula��o A:");
				popA = input.nextDouble();
				
				if(popA > 0) {
					valido = true;
				}else {
					System.out.println("Popula��o de A precisa ser maior que zero");
				}
				
			}while(!valido);
			
			valido = false;
			
			do {
				
				System.out.println("Entre com a Popula��o B:");
				popB = input.nextDouble();
				
				if(popB > 0) {
					valido = true;
				}else {
					System.out.println("Popula��o de B precisa ser maior que zero");
				}
				
			}while(!valido);
			
			valido = false;
			
			do {
				
				System.out.println("Entre com a Taxa de crescimento da popula��o de A:");
				taxaA = input.nextDouble();
				
				if(taxaA > 0) {
					valido = true;
				}else {
					System.out.println("Taxa de A precisa ser maior que zero");
				}
				
			}while(!valido);
			
			valido = false;
			
			do {
				
				System.out.println("Entre com a Taxa de crescimento da popula��o de B:");
				taxaB = input.nextDouble();
				
				if(taxaB > 0) {
					valido = true;
				}else {
					System.out.println("Taxa de b precisa ser maior que zero");
				}
				
			}while(!valido);
			
			int cont = 0;
			
			while(popA < popB) {
				
				popA += (popA/100) * taxaA;
				popB += (popB/100) * taxaB;
				cont++;
			}
				System.out.println("Popula��o A: " + popA);
				System.out.println("Popula��o B: " + popB);
				System.out.println("Qtd anos " + cont);
			}
	
		}
	
