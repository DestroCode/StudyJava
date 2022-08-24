package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		
		//for(;bool;){ ...
		//while(bool){ ...
		//if(bool){ ...
		
		String faixa = "amarela";
		// nesse caso ele deve evoluir continuo sem o break executa todos
		switch (faixa.toLowerCase())
		{
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":			 
			System.out.println("Sei o Heian Sandan...");
		case "vemelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			break;
		default:
			System.out.println("Nao sei de nada.");			
		}
		
	}

}
