package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		
		String resultadoRecuperaco = media >= 5.0 ? "em recuperacao" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoRecuperaco;
		//ternario dentro de outro 
		//String resultado = media >= 7.0 ? "aprovado" : media >= 5.0 ? "em recuperacao" : "reprovado";
		System.out.println("O aluno esta " + resultadoFinal);
		
		
		double nota = 6.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Nao";
		
		System.out.printf("tem desconto? %s", resultado);
	}

}
