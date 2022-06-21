package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os valores num1 e num2 ");
        //entrada de valores
		System.out.print("Num 1:. ");
        double num1 = entrada.nextInt();
        //entrada num1
        System.out.print("Num 2:. ");
        double num2 = entrada.nextInt();
        //entrada num2
        System.out.print("Digite o seu operador [+ / - *:. ");
        String op = entrada.next();
        //entrada operador
        //calcular com else if
//        double resultado = 0;
//        if("+".equals(op)){
//        	resultado = num1 + num2;
//        }else if("/".equals(op)) {
//        	if (num2 != 0) {
//        		resultado = num1 / num2;        		
//        	}else {
//        		System.out.println("Refazer o ensino fundamental Menor!");
//        	}
//        }else if("-".equals(op)) {
//        	resultado = num1 - num2;
//        }else if("*".equals(op)) {
//        	resultado = num1 * num2;
//        }else {        	
//        	System.out.println("Operador invalido Arrombado!!");
//        }
//        
//        System.out.printf("A operacao %f %s %f = %f", num1, op, num2, resultado);
	    entrada.close();
	}

}
