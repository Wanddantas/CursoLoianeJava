package Exercicios02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input();

	}
	

	static void input(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, Informe o primeiro n�mero:");
		int num = scan.nextInt();
		
		verificarNumeroPositivoOuNegativo(num);
		
	}
	
	static void verificarNumeroPositivoOuNegativo(int num) {
		Scanner scan = new Scanner(System.in);
		if(num >= 0) {
			System.out.println("O n�mero � positivo");
		}else if (num < 0) {
			System.out.println("O n�mero � negativo");
		}
			
		}
	}


