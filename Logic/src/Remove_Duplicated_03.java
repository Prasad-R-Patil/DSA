
public class Remove_Duplicated_03 {
	
	public static void main(String[] args) {
		
	
	
		int arr[] = new int[] {3,12,23,5,3,13,12,23,7,-999};
		
		int cnt[] = new int[24];
		
		
		int i,j;
		
		for(i=0; arr[i]!=-999; i++)
		{
			cnt[arr[i]]++;
			
		}
		
		for(i=0,j=0; arr[i]!=-999; i++)
		{
			if(cnt[arr[i]]>0)
			{
				arr[j] = arr[i];
				j++;
				cnt[arr[i]]=0;
			}
			
			
		}
	
	
		arr[j]=-999;
	
		for(i=0; arr[i] != -999 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	
	
	
	
	
	
	}

}
