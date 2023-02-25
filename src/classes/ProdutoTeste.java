package classes;

//import Produto;

public class ProdutoTeste {
	public static void main(String[] args) {
		//int a = 3;
		//Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto("Notebook", 4356.89);
		var p2 = new Produto("Caneta preta", 12.56);
		var p3 = new Produto("Lapiz", 2.5);
		
		Produto.desconto = 0.5; //change
		
		System.out.println(p1.nome + " / " + p1.precoComDesconto());
		System.out.println(p2.nome + " / " + p2.precoComDesconto());
		System.out.println(p3.nome + " / " + p3.precoComDesconto());
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double precoFinal3 = p3.precoComDesconto();
		
		double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3)/3;
		System.out.printf("Media carrinho = R$%.2f", mediaCarrinho);
	} 

}
