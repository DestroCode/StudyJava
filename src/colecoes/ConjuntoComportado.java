package colecoes;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class ConjuntoComportado {
	
	
	public static void main(String[] args) {
		
//		Set<String> lista = new HashSet<>(); //Disorderly
//		Set<String> lista = new TreeSet<>(); //Ordered
		SortedSet<String> lista = new TreeSet<>(); //Ordered
		lista.add("Anna");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");
		
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>(); //Ordered
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(int num: nums) {
			System.out.println(num);
		}
		
	}
	

}
