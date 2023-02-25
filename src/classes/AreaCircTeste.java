package classes;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(5.6);
		AreaCirc a2 = new AreaCirc(6);
		//change static attribute
		AreaCirc.pi=3.1415;
		
		System.out.println(a2.area());
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(15.0));
		
	}

}
