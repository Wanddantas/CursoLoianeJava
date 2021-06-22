package Exercicios02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String periodo;

		System.out.println("Qual periodo você estuda? M-Matutino, V-Vespertino, N-Nortuno: ");
		periodo = input.next();

		verificarPeriodo(periodo);

	}

	static void verificarPeriodo(String periodo) {

		if(periodo.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}else if (periodo.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde");
		}else if(periodo.equalsIgnoreCase("N")) {
			System.out.println("Boa noite");
		}else {
			System.out.println("Valor inválido!");
		}
	}

}
