
public class MAX_MIN_Occurrence_Array_Element {
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {2,3,4,5,6,2,3,4,5,7,8,9,10,7,8,9,10,7,8,9,10,11,11,12,23,7,8,9,2,3,4,2,3,4,-999};
		
		int Ocnt[] = new int [24];
		
		int i,j,k;
		
		for(i=0; arr[i] != -999; i++)
		{
			Ocnt[arr[i]]++;
		}
		
		
		
		int min = 0;
		int max = 0;

		for (i = 0; i < Ocnt.length; i++) 
		{
			if (Ocnt[i] > 0) 
			{
				min = Ocnt[i];
				max = Ocnt[i];
				break;
			}
		}

		for(i = 0; i < Ocnt.length; i++) 
		{
			if(Ocnt[i] > 0) {
				if(Ocnt[i] < min) 
				{
					min = Ocnt[i];
				}
				if(Ocnt[i] > max) 
				{
					max = Ocnt[i];
				}
			}
		}
		
		
		
		
		System.out.println("Elements with Minimum Occurrence (" + min + " times):");
		for(i = 0; i < Ocnt.length; i++) 
		{
			if(Ocnt[i] == min) 
			{
				System.out.println(i);
			}
		}

		System.out.println("\nElements with Maximum Occurrence (" + max + " times):");
		for(i = 0; i < Ocnt.length; i++) 
		{
			if(Ocnt[i] == max) 
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
	}

}
