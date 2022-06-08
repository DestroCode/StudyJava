package fundamentos.operadores;

/**
 * @author DestroCode
 *
 */
public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		//OPERADORES RELACIONAIS
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 > 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		//APLICACAO DE LOGICA
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		//LOGICOS E OPERACIONAIS
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("tem desconto? " + temDesconto);		
				

	}
}
