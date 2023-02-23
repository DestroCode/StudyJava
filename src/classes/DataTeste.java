package classes;

public class DataTeste {
	public static void main(String[] args) {
		Data p1 = new Data();
		p1.dia = 22;
		p1.mes = 2;
		p1.ano = 2023;
		
		System.out.printf("O seu primeiro objeto defino em %s",p1.obterData());
		
	}
	

}
