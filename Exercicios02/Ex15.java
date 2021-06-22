package Exercicios02;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double l1,l2,l3;
		
		System.out.println("Digite o primeiro lado: ");
		l1 = input.nextDouble();
		
		System.out.println("Digite o Segundo lado: ");
		l2 = input.nextDouble();
		
		System.out.println("Digite o Terceiro lado: ");
		l3 = input.nextDouble();
		
		
		verificarTriangulo(l1, l2, l3);
		
		
		
		
	}
	
		static void verificarTriangulo(double l1, double l2, double l3) {
			
			boolean tri = (l1 < l2) && (l2 < l1 + l3) && (l3 < l1 + l2);
			
			boolean eq = (l1 == l2) && (l2 == l3);
			
			boolean es = (l1 != l2) && (l2 != l3);
			
			imprimiMetodos(tri, eq, es);
		
		}
		
		static void imprimiMetodos(boolean tri, boolean eq, boolean es) {
			
			System.out.println("Pode formar um triangulo? " + tri);
			System.out.println("O triangulo e Equilatero? " + eq);
			System.out.println("O triangulo e Escaleno " + es);
			
		}

}
