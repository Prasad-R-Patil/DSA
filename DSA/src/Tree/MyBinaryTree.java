package Tree;

import java.util.Scanner;

public class MyBinaryTree {
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Root Node Data...");
		int data = s.nextInt();
		
		TreeNode new_node = new TreeNode(data);
		
		BinaryTree bt = new BinaryTree(new_node);
		
		
		
		int ch;
		
		do {
			
			System.out.println("BinaryTree Operation....");
			
			System.out.println(" 1.-> InsertNode");
			System.out.println(" 11.-> Display");
			
			
			System.out.println("Enter Your Choice...");
			 ch = s.nextInt();
			 
			 
			 switch(ch)
			 {
					 case 1:
					 {
						 System.out.println("Enter Data...");
						 int d = s.nextInt();
						 bt.Insert_LevelWise(d);
						 System.out.println(d + " Inserted...");
						 break;
					 }
					 
					 case 11:
					 {
						 bt.Display();
						 break;
					 }
					 
					 case 0:
					 {
						 System.out.println("Thank You Tree Operation Completed...");
						 break;
					 }
					 default :
					 {
						 System.out.println("Enter Correct Choice...");
					 }
			 }
			
			
		}while(ch != 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
