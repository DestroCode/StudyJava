package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os valores num1 e num2 ");
        //entrada de valores
		System.out.print("Num 1:. ");
        double num1 = entrada.nextDouble();
        //entrada num1
        System.out.print("Num 2:. ");
        double num2 = entrada.nextDouble();
        //entrada num2
        System.out.print("Digite o seu operador [ + / - * % ]:. ");
        String op = entrada.next();//joga o valor .next()
        //entrada operador
        
        //Logico
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;
        // usando ternarios
        
        
        
        
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
//        	resultado = num1 * num2;`
//        }else {        	
//        	System.out.println("Operador invalido Arrombado!!");
//        }
//        
        System.out.printf("A operacao %.2f %s %.2f = %.2f", num1, op, num2, resultado);
	    entrada.close();
	}

}
