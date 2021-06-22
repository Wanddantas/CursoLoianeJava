package Exercicios02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		
		System.out.println("Digite o seu sálario: ");
		salario = input.nextDouble();
		
		double salarioAntesDoReajuste = salario;
		
		realizarAjusteSalarial(salario,salarioAntesDoReajuste);
		
		//System.out.println("Salário antes do reajuste " + salarioAntesDoReajuste);
		
		
		
	}
	
	static void retornarInformacoes(double salario, double totalSalarial,double salarioAntesDoReajuste) {
		
		System.out.println("Salario antes do reajuste " + salarioAntesDoReajuste);
		
		System.out.println("Novo salario, após o aumento R$: " + (salario + totalSalarial));
		
		System.out.println("O valor do aumento de " + totalSalarial);
		
		
		
		
	}
	
	static void realizarAjusteSalarial(double salario,double salarioAntesDoReajuste) {
		
		double totalSalarial = 0;
		
		if(salario <= 280) {
			
			totalSalarial = (salario/100) * 20;
			System.out.println("Aumento de 20%");
			retornarInformacoes(salario, totalSalarial,salarioAntesDoReajuste);
			
		}else if (salario > 280 && salario < 700) {
			
			totalSalarial = (salario/100) * 15;
			System.out.println("Aumento de 15%");
			retornarInformacoes(salario, totalSalarial,salarioAntesDoReajuste);
			
		}else if (salario >= 700 && salario < 1500) {
			
			totalSalarial = (salario/100) * 10;
			System.out.println("Aumento de 10%");
			retornarInformacoes(salario, totalSalarial,salarioAntesDoReajuste);
			
		}else if (salario >= 1500) {
			
			totalSalarial = (salario/100) * 5;
			System.out.println("Aumento de 5%");
			retornarInformacoes(salario, totalSalarial,salarioAntesDoReajuste);
			
		}
			
	}

}
