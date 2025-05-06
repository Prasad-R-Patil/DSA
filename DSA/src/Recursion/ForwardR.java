package Recursion;



public class ForwardR {
	
	public void fun(int n)
	{
		if(n>5)
		{
			return;
		}
		
		System.out.println(n);
		fun(n+1);
		return;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ForwardR f = new ForwardR();
		
		f.fun(1);
		
	}

}
