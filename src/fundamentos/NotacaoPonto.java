package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
//        s = s.toUpperCase();
		s = s.toLowerCase();
		
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.replace("X", "Senhora"));
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Ariston")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos nao tem o operador "."
	}

}
