package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b; <- mesma atribuicao
		c -= a; //c = c - a;
		c *= b; //c = c * b;
		c /= b; //c = c / b;
		
		c++; // c = c + 1; //ATRIBUICAO UNARIOS
		
		System.out.println(c);
		c %= 2; //c = c / 2; 0 - PAR ou 1 - IMPAR 
		
		System.out.println(c);
	}

}
