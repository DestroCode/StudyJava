package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		// a = "..." nao atribui outro tipo apos ser definido
		a = 12;
		System.out.println(a);
		
		var b = 4.5; // var define o tipo pelo valor atribuido
		System.out.println(b);
		
		var c = "Text";
		System.out.println(c);
		
		// c = 4.5 apos definir o tipo de c nao pode ser atribuido outro
		c = "Outro";
		System.out.println(c);
		
		double d;  // variavel declarada	
		d = 315.5; // variavel iniciada
		System.out.println(d); // utilizada!
		
	}

}
