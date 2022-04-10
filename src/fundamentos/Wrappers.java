package fundamentos;

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		System.out.print("Digte um valor: ");
//		Integer i = Integer.parseInt(entrada.next());
//		Integer r = 3*i;
//		System.out.printf("3 x %d = %d ", i,r);
//		entrada.close();
		//Byte
		Byte b = 100;
		Short s = 1000;
		//int
		Integer i = 100000;
		Long l = 100000L; // converter o valor para long 'l' ou 'L'
		//Flutuante
		Float f = 123.10F; // converter o valor float 'f' ou 'F'
		System.out.println(f.doubleValue());
		
		Double d = 324.323;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		
	}

}
