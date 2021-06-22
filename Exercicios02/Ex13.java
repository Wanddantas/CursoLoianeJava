package Exercicios02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias;
		
		
		System.out.println("Digite de 1 a 7 para os dias da semana: ");
		Scanner input = new Scanner(System.in);
		dias = input.nextInt();
		
		VerificarDiasDaSemana(dias);
		
	}
	
	
	static void VerificarDiasDaSemana(int num) {
		
		switch(num) {
		case 1:
			System.out.println("Domingo ");
		break;
		case 2:
			System.out.println("Segunda-feira ");
		break;
		case 3:
			System.out.println("Terça-feira");
		break;
		case 4:
			System.out.println("Quarta-feira");
		break;
		case 5:
			System.out.println("Quinta-feira");
		break;
		case 6:
			System.out.println("Sexta-feira");
		break;
		case 7:
			System.out.println("Sábado");
		break;
		default:
			System.out.println("Valor inválido");
		break;
		}
		
	}

}
