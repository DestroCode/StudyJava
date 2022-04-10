package fundamentos.operadores;

public class DesafioOpAritmeticos {
	public static void main(String[] args) {
		
		int var1 = (int) Math.pow(6*(3+2), 2) / (3*2);
		int var2 = (int) (Math.pow(((1-5)*(2-7))/2, 2));
		
		int resultado = (int) Math.pow(var1 - var2, 3) / (int) Math.pow(10, 3);
		
		System.out.println(resultado);
	}

}
