package lista01;
//Criar um programa que leia o valor da base e da altura
//de um triângulo e calcule a área.

import java.util.Scanner;

public class Exercico05 {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite os valores do triangulo ");
			//entrada de valores
			System.out.print("Base :. ");
			double base = entrada.nextDouble();
			//entrada base
			System.out.print("Altura:. ");
			double altura = entrada.nextDouble();
			//entrada altura
			
			double area = (base * altura) / 2;
			System.out.printf("A Area do trinagulo e %.2f", area);
		}
        
	}

}
