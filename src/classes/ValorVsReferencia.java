package classes;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //assignment by value (primitive type)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);		
		
		Data d1 = new Data (1, 6, 2022);
		Data d2 = d1; //assignment by reference (Object)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		voltaDataParaValorParao(d1);

		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}
	static void voltaDataParaValorParao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	//not function
	static void alterarPrimitivo(int c) {
		c++;
	}

}
