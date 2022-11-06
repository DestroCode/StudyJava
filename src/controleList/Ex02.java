package controleList;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double valor;
		System.out.println("Digite um ano:");
	   
		valor = entrada.nextDouble();
		//double res = valor/100;
		if(valor%400 == 0) {
			System.out.printf("%.0f e bissexto!",valor);
		}else if(valor%4 == 0) {
			System.out.printf("%.0f e bissexto!",valor);
		}else {
			System.out.printf("%.0f nao e bissexto!",valor);
		}
		entrada.close();
	}

}
