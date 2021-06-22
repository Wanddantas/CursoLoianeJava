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
		
			System.out.println("Informe um usuário:");
			usuario = input.next();
			
			System.out.println("Informe uma senha:");
			senha = input.next();
			
			if(usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usuário e senha são o mesmo!");
				flag = false;
			}else {
				System.out.println("Senha e usuário válidos");
				flag = true;
			}
				
				
			}while(!flag);
		
		}
	}


