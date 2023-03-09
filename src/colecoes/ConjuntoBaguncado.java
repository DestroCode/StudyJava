package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);     // doubel -> Double 
		conjunto.add(true);    // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1);       // int -> Interger
		conjunto.add('x');     // char -> CharacterUniao de conjuntos
		
		System.out.println("Tamanho e " + conjunto.size());
		conjunto.add("Teste"); // String
		System.out.println("Tamanho e " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("x"));
		
		System.out.println("Tamanho e " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains('1'));
		System.out.println(conjunto.contains(true));
		
		Set nums =  new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.add(nums);     //Union of sets
		conjunto.retainAll(nums); //Set interception
		
		System.out.println(conjunto);
	}
//review
}
