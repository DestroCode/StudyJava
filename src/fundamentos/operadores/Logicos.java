package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 2 > 8;
		
		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(cond1 ^ !cond2);
		
		System.out.println("\nTabela Verdade do E (AND)");
		
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTabela Verdade do OU (OR)");
		
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade do OU Exclusivo (XOR)");
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		
	}

}
