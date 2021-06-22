package com.wanderson.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] matrizTri = new int [3][3][3];
		
		for(int i = 0; i < matrizTri.length;i++) {
			for(int j = 0; j < matrizTri[i].length;j++) {
				for(int k = 0; k < matrizTri[i][j].length; k++) {
					matrizTri[i][j][k] = i + j + k;
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 0; i < matrizTri.length;i++) {
			for(int j = 0; j < matrizTri[i].length;j++) {
				for(int k = 0; k < matrizTri[i][j].length; k++) {
					
					soma += matrizTri[i][j][k];
					
					if(matrizTri[i][j][k] % 2 == 0) {
						somaPares += matrizTri[i][j][k];
					}else {
						somaImpares += matrizTri[i][j][k];
					}
					
				}
			}
		}
		
		System.out.println("Soma total = " + soma);
		System.out.println("Soma Pares = " + somaPares);
		System.out.println("Soma Impares = " + somaImpares);
	}

}
