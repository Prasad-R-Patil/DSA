package Recursion;

public class Pattern {
	
	
	public static void Pattern1(int n)
	{
		if(n<1)
		{
			return;
		}
		
		System.out.println(" ");
		
		/*
		 * for(int i = 1; i<=n; i++ ) { System.out.print("* "); }
		 */
		
		StarPrint(n);
		Pattern1(n-1);
		
		return;
	}
	
	public static void StarPrint(int n)
	{
		if(n<1)
		{
			return;
		}
		System.out.print("* ");
		StarPrint(n-1);
		return;
	}
	
	
	public static void Pattern2(int n)
	{
		if(n<1)
		{
			return;
		}
		
		Pattern2(n-1);
		System.out.println(" ");
		StarPrint(n);
		
		/*
		 * for(int i = 1; i<=n; i++ ) { System.out.print("* "); }
		 */
		
		
		return;
	}
	
	
	
	
	public static void main(String[] args) {

		Pattern.Pattern1(10);
		
		System.out.print("");
		
		Pattern.Pattern2(10);
		
	}

}
