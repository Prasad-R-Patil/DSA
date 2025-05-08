package Sorting;

import java.util.Scanner;
import java.util.Vector;

public class MySorting {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		SortingAlgorithm sa = new SortingAlgorithm();
		
		int ch;
		
		do {
			
			System.out.println("Sorting Operation...");
			
			System.out.println(" 1. -> BubbleSort");
			System.out.println(" 2. -> SelectionSort");
			System.out.println(" 3. -> Insertion_Sort");
			System.out.println(" 4. -> Merge_Version1");
			System.out.println(" 5. -> Merge_Version2");
			System.out.println(" 6. -> Merge_Sort_Rec");
			
			System.out.println(" 0. -> Exit");
			
			
			
			System.out.println("Enter Your Choice...");
			ch = s.nextInt();
			
			
			switch(ch)
			{
					case 1:
					{
						System.out.println("******************************************************");
						int arr[] = {12, 5, 8, 2, 15, 7, 1, 10, 4, 14, 3, 11, 6, 9, 13};
						//int arr[] = {11,5,20,30,32,21,23,40,35,2,3,7,32,25,27};
						sa.Bubble_Sort(arr);
						System.out.println("BubbleSort");
						sa.Display(arr);
						System.out.println("\n******************************************************");
						break;
					}
					
					case 2:
					{
						System.out.println("******************************************************");
						int arr[] = {12, 5, 8, 2, 15, 7, 1, 10, 4, 14, 3, 11, 6, 9, 13};
						//int arr[] = {11,5,20,30,32,21,23,40,35,2,3,7,32,25,27};
						sa.Selection_Sort(arr);
						System.out.println("SelectionSort");
						sa.Display(arr);
						System.out.println("\n******************************************************");
						break;
					}
					
					case 3:
					{
						System.out.println("******************************************************");
						int arr[] = {12, 5, 8, 2, 15, 7, 1, 10, 4, 14, 3, 11, 6, 9, 13};
						//int arr[] = {11,5,20,30,32,21,23,40,35,2,3,7,32,25,27};
						sa.Insertion_Sort(arr);
						System.out.println("Insertion_Sort");
						sa.Display(arr);
						System.out.println("\n******************************************************");
						break;
					}
					
					case 4:
					{
						System.out.println("******************************************************");
						int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, }; 
						int[] arr2 = {2, 4, 6, 8, 10, 12, 13, 14, 16, 18, 20};
						
						int[] res = new int[arr1.length + arr2.length];
						
						sa.Merge_Version1(arr1, arr2,res);
						System.out.println("Merge_Version1");
						sa.Display(res);
						System.out.println("\n******************************************************");
						break;
					}
					
					case 5:
					{
						System.out.println("******************************************************");
						int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 2, 4, 6, 8, 10, 12, 13, 14, 16, 18, 20}; 

						int[] res = new int[arr.length];
						
						sa.Merge_Version2(arr, res, 0, 9, 10, 20 );
						System.out.println("Merge_Version2");
						sa.Display(res);
						System.out.println("\n******************************************************");
						break;
					}
					
					case 6:
					{
						System.out.println("******************************************************");
						int[] arr = {12, 5, 87, 2, 45, 19, 61, 3, 78, 22, 95, 10, 38, 55, 71, 28, 6, 91, 15, 52, 31, 77, 1, 40, 68, 18, 83, 25, 99, 48};
						int low = 0;
						int high = arr.length-1;
						
						sa.Merge_Sort_Rec(arr, low, high);
						System.out.println("Merge_Sort_Rec");
						sa.Display(arr);
						System.out.println("\n******************************************************");
						break;
					}
					
					case 0:
					{
						System.out.println("******************************************************");
						
						System.out.println("Thank you... Your Sorting Operation Completed...");
						
						System.out.println("\n******************************************************");
						break;
					}
					default:
					{
						System.out.println("Enter Valid Choice...");
						break;
					}
			}
			
		}while(ch != 0);
		
		
		
	}

}
