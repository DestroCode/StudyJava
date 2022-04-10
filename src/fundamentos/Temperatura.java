package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (F -32) x 5/9 = C
		final int VAR1 = 32;
		final double VAR2 = 5 / 9.0;
		
		double tempF = 86;
		double tempC = (tempF - VAR1) * VAR2;
		System.out.println("O resultado e " + tempC + "°C");
		
		tempF = 97;
		tempC = (tempF - VAR1) * VAR2;
		System.out.println("O resultado e " + tempC + "°C");
		
		
	
	}

}
