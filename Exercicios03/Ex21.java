package Exercicios03;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de turmas");
		int turmas = input.nextInt();
		
		int numAlunos;
		int soma = 0;
		boolean invalido = false;
		
		
		for(int i = 1; i <= turmas; i++) {
			
			invalido = true;
			
			do {
				
			System.out.println("Entre com o n�mero de alunos da turma " + i);
			numAlunos = input.nextInt();
			
			if(numAlunos <= 40){
				invalido = false;
			}else {
				System.out.println("N�mero de alunos inv�lido. Digite novamente!");
			}
			
			}while(invalido);
			
			soma += numAlunos;
		}
		
		double media = soma / turmas;
		
		System.out.println("M�dia: " + media);
	}

}
