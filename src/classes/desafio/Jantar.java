package classes.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		
		Comida c1 = new Comida("Fejao", 0.300);
		Comida c2 = new Comida("Arroz", 0.223);
		
		Pessoa p1 = new Pessoa("Joao", 79.0);
		
		System.out.println("Antes do jantar");
		System.out.println(p1.dados());
		
		p1.comer(c1);
		p1.comer(c2);

		System.out.println("Apos o jantar");
		System.out.println(p1.dados());
		
		
	}

}
