package Exercicios02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aprovacaoAluno();

	}
	
	static void aprovacaoAluno() {
		Scanner input = new Scanner(System.in);
		double nota,nota2;
		System.out.println("Digite a primeira nota");
		nota = input.nextDouble();
		
		System.out.println("Digite a segunda nota");
		nota2 = input.nextDouble();
		
		double soma = nota + nota2;
		
		double media = soma/2;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}else if(media < 7) {
			System.out.println("Reprovado");
		}else if(media == 10){
			System.out.println("Aprovado com Distincao");
		}
			
	}
}

