package classes;

public class Data {
	int dia , mes , ano;
	 //variable initialization
	 //byte , short, int, long -> 0
	 //float, double -> 0.0
	 //bolean -> false
	 //char -> '/u000'
	 //Objeto -> null
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
		final String formato = "%d / %d / %d";
		return String.format(formato, dia, mes, ano);
		//return "" + dia + "/" + mes + "/" + ano; 
	}

}
