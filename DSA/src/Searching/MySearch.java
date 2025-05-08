package Searching;

public class MySearch {
	
	public static void main(String[] args) {
		
		int arr[]={12, 5, 87, 2, 45, 19, 61, 3, 78, 22, 95, 10, 38, 55, 71, 28, 6, 91, 15, 52, 31, 77, 1, 40, 68, 18, 83, 25, 99, 48};
		
		
		Searching s = new Searching();
		
		System.out.println("*********************************************************");
		int res = s.SequentialSearch(arr, 19);
		System.out.println("SequentialSearch Result is -> "+res);
		
		System.out.println("*********************************************************");
		
		int res2 = s.BinarySearch(arr, 71);
		System.out.println("BinarySearch Result is -> "+res2);
		
		System.out.println("*********************************************************");
		
	}

}
