package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		//PRECEDENCIA MENOR POSFIXADA
		a++; // a = a + 1;
		a--; // a = a - 1;
		//PRECEDENCIA MAIOR PREFIXADA
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);//por ter a precedencia do == ira retornar true
		                               //antes do decremento -- 
		System.out.println(a == b);   //resposta aguardada
		System.out.println(a);
		System.out.println(b);
		
	}

}
