package Exercicios04;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        
	        int[] vetorA = new int[10];
	        
	        for (int i=0; i<vetorA.length; i++){
	            
	            System.out.println("Entre com o valor da posi��o A - " + i);
	            vetorA[i] = scan.nextInt();
	        }
	        
	        for (int i=0; i<vetorA.length; i++){
	            
	            System.out.println("Analizando o n�mero " + vetorA[i]);
	            
	            for (int j=2; j<vetorA[i]; j++){
	                if (j % 2 == 0){
	                    System.out.println(j + " � par");
	                }
	            }
	            
	            System.out.println();
	        }

	}

}
