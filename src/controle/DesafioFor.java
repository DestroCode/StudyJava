package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor1 = "#";
		for(int i = 1; i <=5; i++) {
			System.out.println(valor1);
			valor1 += "#";
		}
		
		for(String valor = "#";!valor.equals("######"); valor += "#") {
			System.out.println(valor);

		}
	}
	
	// Versao do desafio
	// Nao pode usar valor numerico para controlar o laco 

}
