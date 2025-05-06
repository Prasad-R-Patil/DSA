package Recursion;

public class DisplayArray {
	
	public void DisplayForward(int a[] , int i)
	{
		if(i>9)
		{
			return;
		}
		
		System.out.print(a[i] + " ");
		
		DisplayForward(a,i+1);
		return;
	}
	
	public void DisplayBackward(int a[] , int i)
	{
		if(i>9)
		{
			return;
		}
		
		DisplayBackward(a,i+1);
		System.out.print(a[i] + " ");
		
		return;
	}
	
	public int SumArrayElement(int a[] , int i)
	{
		if(i>9)
		{
			return 0;
		}
		
		//System.out.print(a[i] + " ");

		return a[i] + SumArrayElement(a,i+1);
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		DisplayArray da = new DisplayArray();
		
		System.out.print("DisplayForward -> ");
		da.DisplayForward(arr, 0);
		
		System.out.print("\n");
		
		System.out.print("DisplayBackward -> ");
		da.DisplayBackward(arr, 0);
		
		
		System.out.print("\n");
		
		int sum = da.SumArrayElement(arr, 0);
		System.out.print("SumArrayElement -> "+sum);
	}

}
