package lista01;

import java.util.Scanner;

//Criar um programa que leia um valor e apresente os
//resultados ao quadrado e ao cubo do valor.
public class Exercicio04 {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite o valor ");
			//entrada de valores
			System.out.print("Numero :. ");
			double numero = entrada.nextDouble();
			//entrada numero
			double resultado1 = numero * numero;
			double resultado2 = numero * numero * numero;
			System.out.printf("%.2f ao quadrado %.2f \n", numero,resultado1);
			System.out.printf("%.2f ao cubo %.2f ", numero,resultado2);
		}
	}
	}


