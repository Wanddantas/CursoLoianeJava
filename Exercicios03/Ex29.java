package Exercicios03;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			
			boolean primo = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					//System.out.println("Não é primo - divisível por " + i);
					primo = false;
				}
			}
			
			if(primo) {
			System.out.println(i);
			}
		}
			
		}

	}


