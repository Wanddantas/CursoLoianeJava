package Exercicios02;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc;
		double quantidadeLitros;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite 1 para alcool e 2 para gasolina? ");
		opc = input.nextInt();
		
		if(opc == 1) {
			System.out.println("Digite a quantidade de litros ? ");
			quantidadeLitros = input.nextDouble();
			descontoAlcool(quantidadeLitros);
		}else if(opc == 2) {
			System.out.println("Digite a quantidade de litros ? ");
			quantidadeLitros = input.nextDouble();
			descontogasolina(quantidadeLitros);
		}else {
			System.out.println("Digite um valor válido: ");
		}

	}
	
		static void descontoAlcool(double l) {
			
		double total = l * 1.90;
		double desconto1 = (total * 3)/ 100;
		double desconto2 = (total * 5)/ 100;
		
		if(l <= 20) {
			total = total - desconto1;
			System.out.println("Valor do alcool com desconto: ");
			System.out.println(total);
		}else if(l > 20) {
			total = total - desconto2;
			System.out.println("Valor do alcool com desconto: ");
			System.out.println(total);
		}
		
	}
	
		static void descontogasolina(double l) {
		
		double total = l * 2.50;
		double desconto1 = (total * 4)/100;
		double desconto2 = (total * 6)/100;
		
		if(l <= 20) {
			total = total - desconto1;
			System.out.println("Valor da gasolina com desconto: ");
			System.out.println(total);
		}else if(l > 20) {
			total = total - desconto2;
			System.out.println("Valor da gasolina com desconto: ");
			System.out.println(total);
		}
		
	}

}
