package controle;

import java.util.Scanner;

public class DesafioDoWhile {
	public static void main(String[] args) {
		//calcular media dos alunos
		
		Scanner entrada = new Scanner(System.in);
		double nota=0;
		int contador=0;
		double validador;
		System.out.println("Faremos a media / Para sair -1");
		
		do {
			System.err.print("Digite sua nota:. ");
			validador = entrada.nextDouble();
			if (validador <= 10 && validador >= 0) {
				nota += validador;
				contador++;
			} else if(validador!=-1){
				System.out.println("Valor incorreto! Respeite o intervalo de 0 a 10");
			}
		} while (validador != -1);
		double media = nota/contador;
		
		System.out.printf("A media da turma e %.2f", media);
		System.out.println("\nEspero ter ajudado!! " + nota + " / " + contador);
		

		entrada.close();
	}

}
