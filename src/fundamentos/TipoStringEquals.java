package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // equals serve para comparar Strings sendo o "=="
		
		Scanner entrada = new Scanner(System.in);
		
		//String s2 = entrada.nextline(); // nao retira os espacos em branco
		String s2 = entrada.next(); // retira os espacos em branco
		System.out.println("2" == s2.trim()); // .trim retira os espacos em branco
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}

}
