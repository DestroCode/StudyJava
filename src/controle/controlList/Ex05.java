package controle.controlList;

import java.util.Scanner;

public class Ex05 {
	private static boolean ehPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		int valor;
		System.out.println("Digite um numero inteiro .:");
		valor = entrada.nextInt();
		if(ehPrimo(valor)) {
			System.out.println("Primo");
		}else {
			System.out.println("Not primo");
		}
		entrada.close();	
	}


}
