package fundamentos.fundamentosList;
//Criar um programa que resolve equações do segundo grau 
//(ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

import java.util.Scanner;

public class Exercico06 {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite os valores referente a equacao de 2 grau ");
	        //entrada de valores
			System.out.print("a :. ");
	        int a = entrada.nextInt();
	        //entrada a
	        System.out.print("b :. ");
	        int b = entrada.nextInt();
	        //entrada b
	        System.out.print("c :. ");
	        int c = entrada.nextInt();
	        //entrada c
	        int delta = (b * b) - (4 * a *c);
	        System.out.printf("\nSua equação é: %dx² + %dx + %d = 0\n", a, b, c);
	        System.out.printf("O delta dessa equacao :. %d\n", delta);
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.printf("O x1 da equação é: %.2f\n", x1);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("O x2 da equação é: %.2f" ,x2);
			entrada.close();
	        
		}
	}

}
