package fundamentos;

public class ConversaoNumToString {
	
	public static void main(String[] args) {
		 Integer num1 = 1000;
		 System.out.println(num1.toString().length());
		 
		 int num2  = 100;
		 System.out.println(Integer.toString(num2).length());
		 
		 Double num3 = 10.33;
		 System.out.println(num3.toString().length());
		 
		 double num4 = 103.54;
		 System.out.println(Double.toString(num4).length());
		 
		 System.out.println(("" + num2).length()); //tb conseque pela concatenacao
		 
	}

}
