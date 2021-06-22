package Exercicios02;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2;
		int opc;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = input.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = input.nextDouble();
		
		System.out.println("");

		menu();
		opc = input.nextInt();
		
		verificarOpcao(opc, num1, num2);
		
	}
	
		static void verificarOpcao(int opc,double num1, double num2) {
			
			if(opc == 1) {
				soma(num1, num2);
			}else if(opc == 2) {
				multiplicacao(num1, num2);
			}else if(opc == 3) {
				divisao(num1, num2);
			}else if(opc == 4 ) {
				subtracao(num1, num2);
			}
			
		}
	
		static void soma(double num1, double num2) {
			double soma = num1 + num2;
			System.out.println("Calculo de soma!");
			imprimirValores(soma);
		}
		static void multiplicacao(double num1, double num2) {
			double multi = num1 * num2;
			imprimirValores(multi);
		}
		static void divisao(double num1, double num2) {
			double div = num1 / num2;
			imprimirValores(div);
		}
		static void subtracao(double num1, double num2) {
			double sub = num1 - num2;
			imprimirValores(sub);
		}
		
		static void imprimirValores(double total) {
			System.out.println("O valor do calculo " + total);
			VerificarImparOuPar(total);
		}
		
		static void menu() {
			
			System.out.println("Digite 1 para Soma: ");
			System.out.println("Digite 2 para Multiplicação: ");
			System.out.println("Digite 3 para Divisão: ");
			System.out.println("Digite 4 para Subtração: ");
			
		}
		
		static void VerificarImparOuPar(double numero) {
			
			double numero2 = numero % 2;
			
			if(numero2 == 0) {
				System.out.println("O número " + numero + " PAR");
			}else {
				System.out.println("O número " + numero + " Impar");
			}
			
		}

}
