package colecoes;

import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArryDeque<String>();
		
		livros.add("O Peqeuno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		livros.size();
		livros.clear();
		livros.isEmpty();
		
		
	}

}
