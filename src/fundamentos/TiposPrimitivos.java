package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informacoes Funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 478;
		int id = 5914161;
		long pontosAcumulados = 3_245_565_323L;
		
		//Tipos numericos reais
		float salario = 11_957.45F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tiposbooleano 
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		System.out.println("Dias de empresa " + anosDeEmpresa*365);
		System.out.println("Numeros de viagens " + numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + " ganha: R$" + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
	}

}
