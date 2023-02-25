package classes;

public class AreaCirc {
	double raio;
	static double pi=3.14;
	
	//Creating constants with FINAL, never change
	//final static double PI=3.1415;
	
	AreaCirc(double raio){
		this.raio = raio;
	}
	double area() {
		return pi * Math.pow(raio, 2);
	}
	//static method
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}

}
