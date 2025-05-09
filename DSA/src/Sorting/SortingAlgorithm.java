package Sorting;

public class SortingAlgorithm {
	
	public void Bubble_Sort(int arr[])
	{
		int i,j,temp;
		
		for(i =arr.length-1; i>=0; i-- )
		{
			for(j=0; j<=i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void Selection_Sort(int arr[])
	{
		int i,j,temp,min;
		
		for(i=0; i<arr.length; i++)
		{
			min = i;
			
			for(j=i+1; j<arr.length; j++)
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
	
	
	public void Insertion_Sort(int arr[])
	{
		int i,j,k;
		
		for(i=1; i<arr.length-1; i++)
		{
			k = arr[i];
			
			for(j=i-1; j>=0 && (k < arr[j]); j--)
			{
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = k;
		}
	}
	
	public void Merge_Version1(int arr[], int arr2[], int res[]) {
	    int i = 0;
	    int j = 0;
	    int tar = 0;

	    while ((i < arr.length) && (j < arr2.length)) { // Corrected the condition here
	        if (arr[i] < arr2[j]) {
	            res[tar] = arr[i];
	            tar++;
	            i++;
	        } else if (arr2[j] < arr[i]) {
	            res[tar] = arr2[j];
	            tar++;
	            j++;
	        } else {
	            res[tar] = arr[i]; // Or res[tar] = arr2[j]; both are equal
	            tar++;
	            i++;
	            j++;
	        }
	    }

	    while (i < arr.length) {
	        res[tar] = arr[i];
	        tar++;
	        i++;
	    }

	    while (j < arr2.length) {
	        res[tar] = arr2[j];
	        tar++;
	        j++;
	    }
	}

	public void Merge_Version2(int arr[], int res[],  int low1, int high1, int low2,  int high2 )
	{
		int i,j,tar;
		i=low1;
		j=low2;
		tar=low1;
		
		
		while( ( i<=high1) && (j<=high2))
		{
			if(arr[i] < arr[j])
			{
				res[tar] = arr[i];
				tar++;
				i++;
			}
			else if(arr[j] < arr[i])
			{
				res[tar] = arr[j];
				tar++;
				j++;
			}
			else
			{
				res[tar]=arr[i];
				tar++;
				i++;
				j++;
			}
		}
		
		
		while(i <= high1)
		{
			res[tar]=arr[i];
			tar++;
			i++;
		}
		while(j <= high2)
		{
			res[tar]=arr[j];
			tar++;
			j++;
		}
		
	}
	
	
	public void Copy(int arr[] , int temp[], int low, int high)
	{
		int i=low;
		
		while(i<=high)
		{
			arr[i] = temp[i];
			i++;
		}
	}
	
	
	public void Merge_Sort_Rec(int arr[], int low, int high)
	{
		int mid;
		int temp[] = new int[arr.length];
		
		if(low<high)
		{
			mid = (low+high)/2;
			
			Merge_Sort_Rec(arr,low,mid);
			Merge_Sort_Rec(arr,mid+1,high);
			
			Merge_Version2(arr,temp,low,mid,mid+1,high);
			Copy(arr,temp,low,high);
		}
				
	}
	
	
<<<<<<< HEAD
	public int Partition(int arr[], int low, int high)
	{
		int left,right,pivot,t;
		
		pivot = arr[low];
		left = low;
		right = high;
		
		while(left <= right)
		{
			while((arr[left] <= pivot) && (left < high))
			{
				left++;
			}
			while(arr[right] > pivot)
			{
				right--;
			}
			
			if(left < right)
			{
				t = arr[left];
				arr[left] = arr[right];
				arr[right] = t;
				left++;
				right--;
			}
			else
			{
				left++;
			}
			
			
		}
		arr[low] = arr[right];
		arr[right] = pivot;
		
		return right;
	}
	
	public void QuickSort(int arr[], int low, int high)
	{
		int pivloc;
		
		if(low >= high)
		{
			return;
		}
		
		pivloc = Partition(arr,low,high);
		QuickSort(arr,low,pivloc-1);
		QuickSort(arr,pivloc+1,high);
	}
=======
	
>>>>>>> 662059bec87e0734a24837509c2bdf9dbb14d9bb
	
	
	
	
	
	
	
	public void Display(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}

}
