package controle.controlList;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor1, valor2;
		System.out.println("Digite nota 1 .:");
		valor1 = entrada.nextInt();
	   
		System.out.println("Digite nota 2 .:");
		valor2 = entrada.nextInt();
		
		double media = (valor1 + valor2)/2;
		
		if (media>=7.0) {
			System.out.println("Aprovado");
		}else if( media>= 4 && media < 7) {
			System.out.println("Recuperacao");
		}else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
