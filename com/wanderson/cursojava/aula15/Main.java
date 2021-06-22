package com.wanderson.cursojava.aula15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Swith case;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número da semana de 1 a 7: ");
		
		int diasemana = scan.nextInt();
		
//		if(diasemana == 1) {
//			System.out.println(" Domingo ");
//		}else if(diasemana == 2) {
//			System.out.println(" Segunda feira ");
//		}else if(diasemana == 3) {
//			System.out.println(" Terça feira ");
//		}else if(diasemana == 4) {
//			System.out.println(" Quarta feira ");
//		}else if(diasemana == 5){
//			System.out.println(" Quinta feira ");
//		}else if(diasemana == 6) {
//			System.out.println(" Sexta feira ");
//		}else if(diasemana == 7) {
//			System.out.println(" Sabado ");
//		}else {
//			System.out.println("Não é um dia valido!");
//		}
		
//		switch(diasemana) {
//		case 1:
//			System.out.println("Domingo");
//		break;
//		case 2:
//			System.out.println("Segunda");
//		break;
//		case 3:
//			System.out.println("terça");
//		break;
//		case 4:
//			System.out.println("quarta");
//		break;
//		case 5:
//			System.out.println("quinta");
//		break;
//		case 6:
//			System.out.println("sexta");
//		break;
//		case 7:
//			System.out.println("Sábado");
//		break;
//		default:System.out.println("Não é um dia valido!");
//		
//		}
		
		switch(diasemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil");
			break;
		case 1:
		case 7:
			System.out.println("Fim de semana");
		break;
		default:System.out.println("Não é um dia valido!");
		
		}
		

	}

}
