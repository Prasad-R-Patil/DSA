package Stack;

public class Int_2C_Stack {
	
	private int arr[];
	private int topA,topB;
	
	Int_2C_Stack()
	{
		arr = new int [10];
		topA = -1;
		topB = arr.length;
		
	}
	
	Int_2C_Stack(int s)
	{
		arr = new int [s];
		topA = -1;
		topB = arr.length;
	}
	
	
	/* ################################################################################################################## */
	
	
	// Stack A Functions
	
	public boolean isFullA()
	{
		if((topB - topA) == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmptyA()
	{
		if((topA == -1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void pushA(int d)
	{
		if((isFullA() ) || (topA == arr.length -1))
		{
			System.out.println("Stack-A i2Cs OverFlow...");
			return;
		}
		else
		{
			topA++;
			
			arr[topA] = d;
			
			return;
					
		}
		
	}
	
	public int popA()
	{
		if(isEmptyA())
		{
			System.out.println("Stack-A i2Cs UnderFlow...");
			return -999;
		}
		else
		{
			int d = arr[topA];
			topA--;
			return d;
		}
	}
	
	public int peekA()
	{
		if(isEmptyA())
		{
			System.out.println("Stack-A i2Cs UnderFlow...");
			return -999;
		}
		else
		{
			
			return arr[topA];
		}
	}
	
	public void DisplayA()
	{
		if(isEmptyA())
		{
			System.out.println("Stack-A  is Empty : Noting to Display...");
		}
		else
		{
			for(int i=topA; i>=0; i--)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	
	
/* ################################################################################################################## */
	
	
	// Stack B Functions
	
	public boolean isFullB()
	{
		if((topB - topA) == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmptyB()
	{
		if((topB == arr.length))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void pushB(int d)
	{
		if((isFullB() ) || (topB == 0))
		{
			System.out.println("Stack-B i2Cs OverFlow...");
			return;
		}
		else
		{
			topB--;
			
			arr[topB] = d;
			
			return;
					
		}
		
	}
	
	public int popB()
	{
		if(isEmptyB())
		{
			System.out.println("Stack-B i2Cs UnderFlow...");
			return -999;
		}
		else
		{
			int d = arr[topB];
			topB++;
			return d;
		}
	}
	
	public int peekB()
	{
		if(isEmptyB())
		{
			System.out.println("Stack-B i2Cs UnderFlow...");
			return -999;
		}
		else
		{
			
			return arr[topB];
		}
	}
	
	public void DisplayB()
	{
		if(isEmptyB())
		{
			System.out.println("Stack-B is Empty : Noting to Display...");
		}
		else
		{
			for(int i=topB; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	
	
	
	
	

}
