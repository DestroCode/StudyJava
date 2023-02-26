package fundamentos.fundamentosList;
//Criar um programa que leia a temperatura em
//Celsius e converta para Fahrenheit.
import java.util.Scanner;

public class Exercico02 {
public static void main(String[] args) {
	try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Digite o valor a ser convertido ");
		//entrada de valores
		System.out.print("C :. ");
		double C = entrada.nextDouble();
		//entrada F
		double F = (C * 1.8) + 32;
		//System.out.println(F);
		//System.out.println(C);
		System.out.printf("%.2f C em Fahrenheit %.2f F", C,F);
	}
}
}
