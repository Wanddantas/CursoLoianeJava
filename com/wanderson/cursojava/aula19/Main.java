package com.wanderson.cursojava.aula19;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] temperaturas = new double[365]; //boa prática
		
		double temp[]; // não é boa prática
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33;
		temperaturas[3] = 34;
		temperaturas[4] = 31.1;
		
		System.out.println("O valor da temperatura dia 01 é: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);//tamanho da array
	
//		for(int i = 0; i<temperaturas.length;i++) {
//			System.out.println("O valor da temperatura do dia " +  (i+1) + " é " + temperaturas[i]);
//		}
//		
		//for melhorado apartir do java 5
		
		for(double temp01 : temperaturas) {
			System.out.println(temp01);
		}
	}

}
