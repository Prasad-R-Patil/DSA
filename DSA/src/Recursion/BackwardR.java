package Recursion;

public class BackwardR {
	
	public void fun(int n)
	{
		if(n>5)
		{
			return;
		}
		
		
		fun(n+1);
		System.out.println(n);
		return;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		BackwardR b = new BackwardR();
		
		b.fun(1);
		
	}


}
