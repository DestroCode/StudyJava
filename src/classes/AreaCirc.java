package classes;

public class AreaCirc {
	double raio;
	static double pi=3.14;
	
	AreaCirc(double raio){
		this.raio = raio;
	}
	double area() {
		return pi * Math.pow(raio, 2);
	}

}
