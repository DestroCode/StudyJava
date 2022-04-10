package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print(("Verdade\n"));
		Scanner entrada = new Scanner(System.in);// Abriu a variavel entrada para receber valores .in
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine(); 
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para trás.
		
		System.out.print("Digite seu signo: ");
		String signo = entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos e de %s ",
				nome, sobrenome, idade, signo);

		
		entrada.close(); // fechou a variavel
	}

}
