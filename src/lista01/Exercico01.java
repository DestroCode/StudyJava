package lista01;
//1 - Criar um programa que leia a temperatura em 
//Fahrenheit e converta para Celsius.



import java.util.Scanner;

public class Exercico01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor a ser convertido ");
        //entrada de valores
		System.out.print("F :. ");
        double F = entrada.nextDouble();
        //entrada F
        double C = (F - 32) * 0.5555555555;
        //System.out.println(F);
        //System.out.println(C);
        System.out.printf("%.2f F em Ceusius %.2f C", F,C);
		
	}

}
