package array;

import java.util.Arrays;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		double[] notasAlunos = new double[4];
		System.out.println(Arrays.toString(notasAlunos));

		notasAlunos[0] = 7.9;
		notasAlunos[1] = 8;
		notasAlunos[2] = 6.7;
		notasAlunos[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunos));
		
		double total=0;
		for (double nota: notasAlunos) {
			total += nota;
		}
		
		System.out.println(total / notasAlunos.length);
		
		
		double[] notasAlunosB = {6.9, 8.9, 5.5, 10};
		double totalB = 0;
		for (double nota: notasAlunosB) {
			totalB += nota;
		}
		
		System.out.println(totalB / notasAlunosB.length);
		
		
	}


}
