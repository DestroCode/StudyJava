package controleList;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor inteiro x :");
	   
		valor = entrada.nextInt();
		
		if(0 < valor && valor < 10) {
			System.out.println(valor + " pertence {0~10}");
		}else {
			System.out.println(valor + " nao pertence {0~10}");
		}
		if(valor%2 == 0) {
			System.out.printf("e Par");
			
		}else {
			System.out.printf("e Impar");
			
		}
		entrada.close();
	}
	

}
