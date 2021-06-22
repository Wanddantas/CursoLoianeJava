package Exercicios04;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		String msg;
		boolean primo;
		
		for(int i =0; i < vetorA.length;i++) {
			
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = input.nextInt();
			
		}
		
		for(int i =0; i < vetorA.length;i++) {
			
			 primo = true;
			
			for(int j = 2; j < vetorA[i];j++) {
				if(vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}
			
			msg = " ";
			
			if(primo) {
				msg = "primo";
			}else {
				msg = "não é primo";
			}
			
			System.out.println(vetorA[i] + msg);
		}

	}

}
