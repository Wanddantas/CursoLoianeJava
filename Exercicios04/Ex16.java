package Exercicios04;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int elemento = 10;
		
		int[] vetorA = new int[elemento];
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Informe o primeiro valor " + (i+1));
			vetorA[i] = input.nextInt();
		}
		
		int somaMenotr15 = 0;
		int igual15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		
		for(int i = 0; i < vetorA.length;i++) {
			if(vetorA[i] == 15) {
				igual15++;
			}else if(vetorA[i] < 15) {
				somaMenotr15 += vetorA[i];
			}else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}
		}
		
		System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Qtd n�meros == 15: " + igual15);
        System.out.println("Soma n�meros < 15: " + somaMenotr15);
        System.out.println("M�dia n�meros > 15: " + (somaMaior15/qtdMaior15));
		

	}

}
