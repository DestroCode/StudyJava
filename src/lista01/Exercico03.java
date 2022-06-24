package lista01;
//Criar um programa que leia o peso e a altura 
//do usuário e imprima no console o IMC.

import java.util.Scanner;

public class Exercico03 {
public static void main(String[] args) {
	try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Digite os valores segundo ");
		//entrada de valores
		System.out.print("peso:. ");
		double peso = entrada.nextDouble();
		//entrada peso
		System.out.print("altura:. ");
		double altura = entrada.nextDouble();
		//entrada altura
		altura *= altura;
		double IMC = peso/altura;
		System.out.printf("O seu IMC e %.2f", IMC);
	}
    
}
}
