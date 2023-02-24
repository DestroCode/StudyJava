package classes;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	Produto(){
		this.nome = "";
		this.preco = 0.0;
		this.desconto = 0.0;
	}
	
	double precoComDesconto() {
		return this.preco * (1 - this.desconto);
	}
		

}
