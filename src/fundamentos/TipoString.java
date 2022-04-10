package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola Mundo".charAt(2));
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde")); 
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.indexOf("tarde")); // o index que comeca
	    System.out.println(s.substring(4));
	    System.out.println(s.substring(4, 8));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 43;
		var salario = 1500.00;
		
		System.out.println("Nome : " + nome + "\nSobrenome : "
				+ sobrenome + "\nIdade : " + idade
				+ "\nSalario : " + salario);
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%f", nome,
				sobrenome, idade, salario);
		
		System.out.printf("\nO Senhor %s %s tem %d anos e ganha R$%.2f\n", nome,
				sobrenome, idade, salario);
		
		String frase = String.format("O Senhor %s %s tem %d anos e ganha R$%.2f", nome,
				sobrenome, idade, salario);
		
		System.out.println(frase);
	}

}
