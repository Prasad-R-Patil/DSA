
public class FindAllElementUniqueOrNot {
	
	public static void main(String[] args) {
		
		
		int arr[] = new int[] {3,12,23,5,3,13,12,23,7,8,9,7,18,15,24,24,-999};
		
		//int arr[] = new int[] {1,2,3,4,5,6,7,8,9,-999};
		
		int cnt[] = new int[25];
		
		int i,j, ecnt=0;
		
		
		for(i=0; arr[i] != -999; i++)
		{
			cnt[arr[i]]++;
		}
		
		
		for(j=0; j<cnt.length; j++)
		{
			if(cnt[j]==1)
			{
				ecnt++;
			}
		}
		
		
//		System.out.println(arr.length -1);
//		System.out.println(ecnt);
		
		if(ecnt == arr.length-1)
		{
			System.out.println("All Array Element are Unique");
		}
		else
		{
			System.out.println("All Array Element are Not Unique");
		}
		
		
	}

}
