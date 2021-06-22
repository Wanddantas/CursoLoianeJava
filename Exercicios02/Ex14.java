package Exercicios02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1,nota2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor da nota: ");
		nota1 = input.nextInt();
		
		System.out.println("Insira o segundo valor de nota: ");
		nota2 = input.nextInt();
		
		double mediaAluno = calcularMedia(nota1, nota2);
		
		
		System.out.println("nota1: " + nota1);
		System.out.println("nota2: " + nota2);
		System.out.println("Media: " + mediaAluno);
		VerificaConceito(mediaAluno);
		
	}
	
	static double calcularMedia(double nota1,double nota2) {
		
		double media = (nota1 + nota2) / 2;
		
		return media;
	}
	
	static void VerificaConceito(double c) {
		
		if(c >= 9 && c <= 10) {
			System.out.println("A");
			System.out.println("Aprovado");
		}else if(c >= 7.5 && c < 9) {
			System.out.println("Aprovado");
			System.out.println("B");
		}else if(c >= 6.0 && c < 7.5) {
			System.out.println("Aprovado");
			System.out.println("C");
		}else if(c >= 4.0 && c < 6.0) {
			System.out.println("Reprovado");
			System.out.println("D");
		}else if(c >=0 && c < 4) {
			System.out.println("Reprovado");
			System.out.println("E");
		}else {
			System.out.println("Nota inválida");
		}
		
	}

}
