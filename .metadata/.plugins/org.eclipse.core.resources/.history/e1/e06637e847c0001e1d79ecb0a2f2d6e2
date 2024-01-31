package array;

import java.util.Scanner;

public class Aluno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas notas serao informadas :");
	    int valor = entrada.nextInt();
		
	    double[] notas = new double[valor];
	    System.out.println("Informe as notas");
	    for (int i = 0; i < notas.length; i++) {
			System.out.print("n" + (i+1) + ": "); 
			notas[i]=entrada.nextDouble();
		}
	    double total = 0.0;
	    for(double nota:notas) {
	    	total += nota;
	    }
	    
	    System.out.println("Sua media e " + total/notas.length);
		
		entrada.close();
	}

}
//Bora progamar e para de ideia! O amanhã vai acabar com seus vicios e vai te resgastar! Estude.