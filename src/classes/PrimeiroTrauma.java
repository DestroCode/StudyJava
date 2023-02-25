package classes;

public class PrimeiroTrauma {
	int a = 3;
	static int b = 4;
	public static void main(String[] args) {
		PrimeiroTrauma teste = new PrimeiroTrauma();//created instance to access the attribute
		
		System.out.println(teste.a); 
		System.out.println(b); //static methods and attributes can have access
	}

}
