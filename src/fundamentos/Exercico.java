package fundamentos;
public class Exercico {
	

	
    public static void main(String[] args) {
    	int[] x = {2,3,5};
    	int y = 2;
    	
    	int resp01 = findLast(x,y);
    	System.out.println("Respsota 01: "+resp01);
    	
    	int[] text02 = {0,1,0};
    	int resp02 = lastZero(text02);
    	System.out.println("Resposta 02: "+resp02);
    	
    	int[] text03 = {-4,2,0,2};
    	int resp03 = countPositive(text03);
    	System.out.println("Resposta 03: "+resp03);
    	
    	int[] text04 = {-3,-2,0,4};
    	int resp04 = oddOrPos(text04);
    	System.out.println("Resposta 04: "+resp04);
    	
    	
	}

	public static int findLast (int[]x,int y) {
		for (int i=x.length-1; i>0 ;i--)
		{
		 if(x[i] == y)
		 {
			 return i;
		 }
		}
		return -1;
	}
	
	public static int lastZero(int[]x) {
		for(int i = 0; i < x.length; i++)
		{
			if (x[i]==0)
			{
				return i;
			}
		}
		return -1;
	}

	public static int countPositive(int[]x){
		int count = 0;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] >= 0) {
				count++;
			}
		}
		return count;
	}

	public static int oddOrPos(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length;i++) 
		{
			if(x[i]%2 == 1 || x[i] > 0) 
			{
				count++;
			}
		}
		return count;
	}

}
