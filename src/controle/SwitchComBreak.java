package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		//entrada
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
		//casos		
		switch (nota) {
		case 10: case 9:
			conceito = "A+";
			break;
		case 8: case 7:
			conceito = "A";
			break;
		case 6:
			conceito = "B";
			break;
		case 5:
		    conceito = "C";
			break;
		case 4:
			conceito = "C-";
			break;
		case 3: case 2: case 1:
			conceito = "E";
			break;
		case 0:
			conceito = "ZERO";
			break;
		default:
		        conceito = "nao encontrado!";	
		}
		System.out.println("Conceito " + conceito);
		entrada.close();
	}

}
