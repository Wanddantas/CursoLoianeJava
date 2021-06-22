package Exercicios02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int produto1,produto2,produto3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do 1° produto: ");
		produto1 = input.nextInt();
		
		System.out.println("Digite o valor do 2° produto: ");
		produto2 = input.nextInt();
		
		System.out.println("Digite o valor do 3° produto: ");
		produto3 = input.nextInt();
		
		comprarProduto(produto1,produto2,produto3);
		
		
	}
	
	static void comprarProduto(int produto1,int produto2,int produto3) {
		if(produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O produto mais barato é o produto 1° com o valor de " + produto1);
		}else if(produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O produto mais barato é o produto 2° com o valor de " + produto2);
		}else if(produto3 <= produto1 && produto3 <= produto1) {
			System.out.println("O produto mais barato é o produto 3° com o valor de " + produto3);
		}else {
			System.out.println("");
		}
			System.out.println("Fim do programa");
	}

}
