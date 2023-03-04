package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Peqeuno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.peek()); // return null when it's an empty stack
		System.out.println(livros.element()); // return a java exception when it's an empty stack
		
		System.out.println(livros.pop());
		System.out.println(livros.poll()); // remove the element and return null when it's an empty stack
		System.out.println(livros.remove()); //remove the element and return a java exception when it's an empty stack
		
		//livros.size();
		//livros.clear();
		//livros.isEmpty();
		//livros.contains(livros);
		
	}

}
