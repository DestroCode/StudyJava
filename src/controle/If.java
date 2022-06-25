package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Informa a media: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) { //estrutura de blocos {}
			System.out.println("Aprovado!");
			System.out.println("Parabens!");
		}
		
		
		if(media < 7 && media >= 4.5) //identacao 
			System.out.println("Recuperacao, bora estudar mais!");
		
		
		boolean criterioReprovacao = media < 4.5 && media >=0;
		if(criterioReprovacao) { //utilizando valor boolean
			System.out.print("Reprovado seu burro!");
		}
					
		entrada.close();
	}
}
