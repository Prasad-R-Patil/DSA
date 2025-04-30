
public class PrintOnlyDuplicatedElement {
		
		
		public static void main(String[] args) {
			
			
			int arr[] = new int[] {3,12,23,5,3,13,12,23,7,8,9,7,18,15,24,24,-999};
			
			int cnt[] = new int[25];
			
			int i,j;
			
			
			for(i=0; arr[i] != -999; i++)
			{
				cnt[arr[i]]++;
			}
			
			
			for(j=0; j<cnt.length; j++)
			{
				if(cnt[j] > 1)
				{
					System.out.println(j);
				}
			}
			
			
			
			
			
			
			
		}

}
