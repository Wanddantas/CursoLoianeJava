package Exercicios03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		String usuario;
		String senha;
		
		boolean flag = false;
		
		
			do {
		
			System.out.println("Informe um usu�rio:");
			usuario = input.next();
			
			System.out.println("Informe uma senha:");
			senha = input.next();
			
			if(usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usu�rio e senha s�o o mesmo!");
				flag = false;
			}else {
				System.out.println("Senha e usu�rio v�lidos");
				flag = true;
			}
				
				
			}while(!flag);
		
		}
	}


