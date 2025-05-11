package Exam;

public class Sort {
	
	private int arr[];
	private int temp;
	
	public Sort()
	{
		 arr = new int[] {43, 7, 89, 12, 5, 67, 21, 34, 9, 76};

	}
	
	public void BubbleSort()
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
							
				}
			}
		}
		
	}
	
	
	public void SelectionSort()
	{
		for(int i=0; i<arr.length; i++)
		{
			int min = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			if(min != i)
			{
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				
			}
		}
		
	}
	
	
	public void InsertionSort()
	{
		for(int i=1; i<arr.length; i++)
		{
			
			for(int j=i-1; j>=0; j--)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
					for(int k = 0; k<arr.length; k++)
					{
						System.out.print(arr[k]+ " ");
					}
					System.out.println();
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	public void Display()
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Sort sort = new Sort();
		
//		sort.BubbleSort();
//		sort.Display();
		
//		sort.SelectionSort();
//		sort.Display();
		
		sort.InsertionSort();
		sort.Display();
		
		
	}

}
