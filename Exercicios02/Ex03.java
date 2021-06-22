package Exercicios02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input();
	}
		static void input(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, Informe uma letra:");
		String letra = scan.next();
		
		VerificarSe…MasculidoOuFeminino(letra);
	}
		
		static void VerificarSe…MasculidoOuFeminino(String letra) {
			if(letra.equalsIgnoreCase("m")) {
				System.out.println("Masculino");
			}else if(letra.equalsIgnoreCase("M")){
				System.out.println("Feminino");
			}else {
				System.out.println("Sexo inv·lido");
			}
		}
}
