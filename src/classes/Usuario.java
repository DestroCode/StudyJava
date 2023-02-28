package classes;

public class Usuario {
	
	String nome;
	String email;
	
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) { //check instance
		Usuario outro = (Usuario) obj;
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		}else {
			return false; 
		}
	}
	//Hascode build in another class
	//Example
	public int hashCode() {
		return 0;
	}

}
