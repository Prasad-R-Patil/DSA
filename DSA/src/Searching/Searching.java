package Searching;

public class Searching {
	
	
	
	public int SequentialSearch(int arr[],int key)
	{
		int i;
		
		for(i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	
	
	public int BinarySearch(int arr[], int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid;
		
		
		while(low<high)
		{
			mid = (low + high)/2;
			
			if(arr[mid] == key)
			{
				return mid;
			}
			
			if(key < arr[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	
	
	

}
