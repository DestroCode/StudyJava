package fundamentos.operadores;

public class DesafioOpLogicos {
	
	public static void main(String[] args) {
		// Trabalho na Terca (V ou F)
		// Trabalho na Quinta (V ou F)
		
		boolean tab1 = true;
		boolean tab2 = false;
		
		boolean comprouTV50 = tab1 && tab2;
		boolean comprouTV32 = tab1 ^ tab2;
		boolean comprouSorvete = tab1 || tab2;
		
		//operador unario
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV50\"? " + comprouTV50);
		System.out.println("Comprou TV32\"? " + comprouTV32);
		System.out.println("Comprou Sorevete? " + comprouSorvete);
		System.out.println("Mais Saudavel? " + maisSaudavel);
		
		
		
	}

}
