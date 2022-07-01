package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		//Domingo -> 1
		//quata - > 4
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana :. ");
		
		String dia = entrada.next();
		
		if (dia.equals("\n Domingo")) {
			System.out.println("1");
		}else if (dia.equals("\n Segunda")) {
			System.out.println("2");
		}else if (dia.equals("\n Terca")) {
			System.out.println("3");
		}else if (dia.equals("\n Quarta")) {
			System.out.println("4");
		}else if (dia.equals("\n Quinta")) {
			System.out.println("5");
		}else if (dia.equals("\n Sexta")) {
			System.out.println("6");
		}else if (dia.equals("\n Sabado")) {
			System.out.println("7");
		}else {
			System.out.println("\n Valor incorreto !!!");
		}
		
		entrada.close();
		

	}
}
