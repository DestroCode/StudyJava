package fundamentos;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os seus 3 ultimos salarios");
        //entrada de valores
		System.out.print("Digite o seu primeiro salario:");
        String salario1 = entrada.next();
//        String salario1 = entrada.next().replace(',', '.');  // ja embutiu a tratativa com a entrada
        System.out.print("Digite o seu segundo salario:");
        String salario2 = entrada.next();
        System.out.print("Digite o seu terceiro salario:");
        String salario3 = entrada.next();
        //tratando os valores de entrada com ,
        salario1 = salario1.replace(',', '.');
        salario2 = salario2.replace(',', '.');
        salario3 = salario3.replace(',', '.');
        //Converter os salarios
        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);
        //Retornando a Media entre os salrios
        double media = (s1 + s2 + s3) / 3;
                
        System.out.println("A media dos seus 3 Salarios: " + media);
		
		entrada.close();
	}

}
