
public class Remove_Duplicated_01 {
	
	public static void main(String[] args) {
		
		
		int arr[] = new int[] {3,12,23,5,3,13,12,23,7,-999};
		
		int i,j;
		
		for(i=0; arr[i] != -999 ; i++)
		{
			
			for(j=i+1; arr[j] != -999; j++)
			{
				if(arr[i] == arr[j])
				{
					for(int k=j; arr[k]!= -999 ; k++)
					{
						arr[k] = arr[k+1];
					}
					
					
				}
			}
		}
		
		
		for(i=0; arr[i] != -999 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}

}
