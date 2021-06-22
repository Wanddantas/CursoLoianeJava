package Exercicios04;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		
		double[] notas2 = new double[notas1.length];
		
		double[] result = new double[notas1.length];
		
		for(int i = 0; i < notas1.length;i++) {
			
			System.out.println("Informe a Primeira nota do " + (i+1) + " aluno");
			notas1[i] = input.nextDouble();
			
			System.out.println("Informe a Segunda nota do " + (i+1) + " aluno");
			notas2[i] = input.nextDouble();
			
			result[i] = (notas1[i] + notas2[i]) / 2;
			
		}
		
		String status;
		
		for(int i = 0; i < result.length;i++) {
			if(result[i] >= 7) {
				status = "Aprovado";
			}else {
				status = "Reprovado";
			}
			System.out.println("Aluno " + (i+1) + " Média: " + result[i] + "-Status: " + status);
		}
		
	}

}
