package Exercicios02;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número para verificar se é ímpar ou par: ");
		num = input.nextInt();
		
		ImparOuPar(num);

	}
	
	static void ImparOuPar(int num) {
		
		int num2 = num % 2;
		
		if(num2 == 0) {
			System.out.println("O número " + num + " PAR");
		}else if(num2 != 0){
			System.out.println("O número " + num + " ÍMPAR");
		}else {
			System.out.println("O número é inválido");
		}
		
	}

}
