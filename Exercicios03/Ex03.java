package Exercicios03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		do {
			System.out.println("Entre com o nome: ");
			nome = input.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo 3 caracteres.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com a idade: ");
			idade = input.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com o salario: ");
			salario = input.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que 0");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com o sexo: ");
			sexo = input.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com o Estado Cívil: ");
			estadoCivil = input.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado Cívil precisa ser 's','c','v','d'");
			}
		} while (!infoValida);

		System.out.println("As seguintes informações foram coletadas!");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("salario: " + salario);
		System.out.println("sexo: " + sexo);
		System.out.println("Estado Cívil: " + estadoCivil);

	}

}
