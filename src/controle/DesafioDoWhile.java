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
		//abertura da entrada de dados
		do {
			System.err.print("Informe a nota:. ");
			validador = entrada.nextDouble(); // recebendo a variavel para ser validada
			if (validador <= 10 && validador >= 0) { //validou atribui ++
				nota += validador;
				contador++;
			} else if(validador!=-1){ // caso seja diferente da saida 
				System.out.println("Valor incorreto! Respeite o intervalo de 0 a 10");
			}
		} while (validador != -1);
		double media = nota/contador; // calcula a media
		
		System.out.printf("A media da turma e %.2f", media);
		System.out.println("\nEspero ter ajudado!! " + nota + " / " + contador);
		
		entrada.close();
        //fim!
	}

}
