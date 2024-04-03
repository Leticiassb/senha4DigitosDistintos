package MeuProjeto;

import java.util.Scanner;

public class senha {
	
	

	public static void main(String[] args) {
		
		while (true) {
		
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		int contarDigitos = 0;
		int a = 0, b = 0, c = 0, d = 0;
		
		System.out.println("Digite uma senha");
		
		senha = sc.nextInt();
		
		contarDigitos = (int) (Math.log10(senha) + 1);
		
		if (contarDigitos == 4) {
			
			d = senha / 1000;
			a = (senha / 100) % 10;
			b = (senha % 100) / 10;
			c = (senha % 10) % 10;
			
			
			
		}
		
		if (a != b && a != c && a != d && b != c && b!= d && c!= d) {
			
			System.out.println("Sua senha é valida.");
		} else {
			
			System.out.println("Sua senha é invalida");

		}
		}
	}

}
