package Exercicios03;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;
		
		
		do {
			
			System.out.println("Deseja Informar uma nova compra? S/N");
			continuarCompra = input.next();
			
			if(continuarCompra.equalsIgnoreCase("s")){
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra: ");
				qtdProdutos = input.nextInt();
				
				total = 0;
				
				for(int i =1; i <= qtdProdutos; i++) {
					System.out.println("Informe o preço do produto " + i);
					preco = input.nextDouble();
					
					total += preco;
					
					output += "Produto " + i + "R$" + preco + "\n";
				}
				
				output = "Total: R$ " + total;
				
				System.out.println("Total: R$ " + total);
				
				System.out.println("Entre com o valor pago:");
				valorPago = input.nextDouble();
				
				output += " Dinheiro: R$" + valorPago + "\n";
				
				troco = total - valorPago;
				
				output += "Troco: R$ " + troco;
				
				System.out.println(output);
				
				
			}else {
				sair = true;
			}
			
		
		}while(!sair);

	}

}
