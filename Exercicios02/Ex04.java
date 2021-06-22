package Exercicios02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input();

	}
	
	static void input(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, Informe uma letra:");
		char letra = scan.next().charAt(0);
		
		verificarSe…Vogal(letra);
	
	}
	
	static void verificarSe…Vogal(char letra) {
		
		switch(letra) {
		
		case 'A':
		case 'a':
			System.out.println("A È Vogal");
		break;
		case 'E':
		case 'e':
			System.out.println("E È Vogal");
		break;
		case 'I':
		case 'i':
			System.out.println("I È Vogal");
		break;
		case 'O':
		case 'o':
			System.out.println("O È Vogal");
		break;
		case 'U':
		case 'u':
			System.out.println("U È Vogal");
		break;
		default:
			System.out.println("Valor È uma cosoante");
		
		}
		
		
	}

}
