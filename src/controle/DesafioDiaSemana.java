package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		//Domingo -> 1
		//Quarta - > 4
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da semana :. ");//nao saltar a linha
		
		String dia = entrada.next();
		
//		if ("domingo".equalsIgnoreCase(dia)) { // usando o proprio argumento
//			System.out.println("\n1");
//		if ("domingo".equals(dia.toLowerCase()) { // passando o argumento minusculo toLowerCase()
//			System.out.println("\n1");
		if (dia.equalsIgnoreCase("domingo")) { //ignora letras maiusculas equalsIgnoreCase
			System.out.println("\n1");
		}else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("\n2");
		}else if (dia.equalsIgnoreCase("terca")) {
			System.out.println("\n3");
		}else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("\n4");
		}else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("\n5");
		}else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("\n6");
		}else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("\n7");
		}else {
			System.out.println("\nValor incorreto !!!");
		}
		
		entrada.close();
		

	}
}
