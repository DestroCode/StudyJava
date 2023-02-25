package classes;

public class Data {
	int dia , mes , ano;
	
	 Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	 Data() {
		//this.dia = 01;
		//this.mes = 01;
		//this.ano = 1970;
		 this(1,1,1970); //passing the values ​​through another constructor
	}

	String obterData() {
		// return String.format("%d/%d/%d, dia, mes, ano);
		return "" + dia + "/" + mes + "/" + ano; 
	}

}
