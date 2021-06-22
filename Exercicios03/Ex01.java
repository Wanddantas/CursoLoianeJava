package Exercicios03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		boolean notaValida = false;
		
		int nota;
		
		do {
		
		System.out.println("Entre com uma nota: ");
		nota = input.nextInt();
		
		if(nota >=0 && nota <= 10) {
			notaValida = true;
			System.out.println("Você digitou :" + nota);
		}else {
			notaValida = false;
			System.out.println("Nota inválida, digite novamente.");
		}
		
		}while(!notaValida);
	
	}
}
		

