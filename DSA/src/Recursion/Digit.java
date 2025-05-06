package Recursion;

public class Digit {
	
	public static int CountDigit(int n)
	{
		if(n/10 == 0)
		{
			return 1;
		}
		
		return 1 + CountDigit(n/10);
	}
	
	public static int SumOfDigit(int n)
	{
		if(n/10 == 0)
		{
			return n;
		}
		
		return n%10 + SumOfDigit(n/10);
	}
	
	public static void ReverseNumber(int n)
	{
		if(n/10 == 0)
		{
			System.out.print(n);
			return ;
		}
		System.out.print(n%10);
		
		ReverseNumber(n/10);
		
		return ;
	}
	
	public static int PowerNumber(int n , int p)
	{
		if(p == 0)
		{
			return n ;
		}
		
		return n* PowerNumber(n,p-1);
	}
	
	
	public static void Odd(int n)
	{
		
		if(n>25	)
		{
			return;
		}
		System.out.println("Even "+n);
		Even(n+1);
	}
	
	public static void Even(int n)
	{
		System.out.println("Odd "+n);
		Odd(n+1);
	}
	
	
	
	
	public static void main(String[] args) {
		
		int c = Digit.CountDigit(852852);
		
		System.out.print("CountDigit -> " + c);
		
		System.out.println();
		
         int d = Digit.SumOfDigit(852852);
		
		System.out.print("SumOfDigit -> " + d);
		
		System.out.println();
		
		System.out.print("ReverseNumber -> ");
		Digit.ReverseNumber(852852);
	
		System.out.println();
		
        int p = Digit.PowerNumber(2,5);
		
		System.out.print("PowerNumber -> " + p);
		
		
		System.out.println();
		
        Digit.Even(1);
		
		
	}
	
	

}
