package classes.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida a) {
		if(a != null)
		this.peso += a.peso;
	}
	
	String dados() {
		return this.nome + " tem o peso :" + this.peso + "kgs";
	}

}
