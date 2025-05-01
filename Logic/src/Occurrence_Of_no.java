
public class Occurrence_Of_no {
	
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {3,12,23,5,3,13,12,23,7,-999};
		
		
		int cnt[] = new int [24];
		
		int i,j;
		
		
		for(i=0; arr[i] != -999; i++)
		{
			cnt[arr[i]]++;
		}
		
		for(j=0; j<cnt.length; j++)
		{
			if(cnt[j]>0)
			{
				System.out.println("Occurrence of " + j + " i2Cs  => " + cnt[j]);
			}
		}
		
	
		
		
		
	}
	

}
