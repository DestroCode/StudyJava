package classes;

public class Produto {
	
	String nome;
	double preco;
	//challenge 25% story
	static double desconto = 0.25;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		//this.desconto = desconto;
	}
	
	Produto(){
		this.nome = "";
		this.preco = 0.0;
		//this.desconto = 0.0;
	}
	
	double precoComDesconto() {
		return this.preco * (1 - desconto);
	}
		

}
