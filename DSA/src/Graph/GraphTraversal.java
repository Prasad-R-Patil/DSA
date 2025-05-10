package Graph;

import java.util.Scanner;

import Stack.Student;

public class GraphTraversal {
	
	public static void main(String[] args) {
	
		BFS_Traversal BF = new BFS_Traversal(9);
		DFS_Traversal DF=new DFS_Traversal(12);
		
		int ch;
		Scanner s = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Hashing Operation...");
			
			System.out.println("1. -> InsertRecord");
			System.out.println("2. -> SearchRecord");
			
			System.out.println("11. -> DisplayRecords");
			System.out.println("0. -> Exits");
			
			
			System.out.println("Enter Your Choice....");
			ch = s.nextInt();
			
			
			switch(ch)
			{
					case 1:
					{
						System.out.println("*********************************************************");

						BF.create_graph();
				        BF.BFS_Traversal(1);
				        
						System.out.println("*********************************************************");
						break;
					}
					
					case 2:
					{
						System.out.println("*********************************************************");

						DF.insert_edge(0, 1);
				        DF.insert_edge(0, 3);
				        DF.insert_edge(1, 2);
				        DF.insert_edge(1, 5);
				        DF.insert_edge(1, 4);
				        DF.insert_edge(2, 3);
				        DF.insert_edge(2, 5);
				        DF.insert_edge(3, 6);
				        DF.insert_edge(4, 7);
				        DF.insert_edge(5, 7);
				        DF.insert_edge(5, 6);
				        DF.insert_edge(5, 8);
				        DF.insert_edge(6, 9);
				        DF.insert_edge(8, 9);
				        DF.insert_edge(7, 8);
						
				        DF.DF_Traversal(0);
				        System.out.println();
				        DF.display();
				        
						System.out.println("*********************************************************");
						break;
					}
					
					
					case 0:
					{
						System.out.println("Thank You Operation Completed...");
					}
					default :
					{
						System.out.println("*********************************************************");
						System.out.println("Enter Valid Choice Number...");
						System.out.println("*********************************************************");
						break;
					}
			}
			
		}while(ch != 0);
		
		
		
        
        
        
        
		
        DF.insert_edge(0, 1);
        DF.insert_edge(0, 3);
        DF.insert_edge(1, 2);
        DF.insert_edge(1, 5);
        DF.insert_edge(1, 4);
        DF.insert_edge(2, 3);
        DF.insert_edge(2, 5);
        DF.insert_edge(3, 6);
        DF.insert_edge(4, 7);
        DF.insert_edge(5, 7);
        DF.insert_edge(5, 6);
        DF.insert_edge(5, 8);
        DF.insert_edge(6, 9);
        DF.insert_edge(8, 9);
        DF.insert_edge(7, 8);
		
        DF.DF_Traversal(0);
        System.out.println();
        DF.display();
	}
	
		
}
