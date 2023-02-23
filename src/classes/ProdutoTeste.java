package classes;

//import Produto;

public class ProdutoTeste {
	public static void main(String[] args) {
		//int a = 3;
		//Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta;";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		var p3 = new Produto();
		p3.nome = "Lapiz;";
		p3.preco = 2.5;
		p3.desconto = 0.15;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p3.nome);
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double precoFinal3 = p3.precoComDesconto();
		
		double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3)/3;
		System.out.printf("Media carrinho = R$%.2f", mediaCarrinho);
	} 

}
