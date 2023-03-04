package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Anna");
		fila.offer("Bia"); //return true or false when this method add #test fullstack
		fila.add("Carlos");
		fila.offer("Daniel");
		System.out.println(fila.add("Rafaela"));
		System.out.println(fila.offer("Guui"));
		
		System.out.println(fila.peek());
		System.out.println(fila.peek()); // return null when it's an empty list
		System.out.println(fila.element()); // return a java exception when it's an empty list
		System.out.println(fila.element());
		
		//fila.size();
		//fila.isEmpty();
		//fila.clear();
		
	}

}
