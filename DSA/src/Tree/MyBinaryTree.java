package Tree;

import java.util.Scanner;

public class MyBinaryTree {
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		/*
		System.out.println("Enter Root Node Data...");
		int data = s.nextInt();
		
		TreeNode new_node = new TreeNode(data);
		
		BinaryTree bt = new BinaryTree(new_node);
		*/
		
		// Binary Tree
		
		BinaryTree bt = new BinaryTree();
		BinaryTree bt2 = new BinaryTree();
		
		// Binary Search Tree
		
		BinarySearchTree bst = new BinarySearchTree();
		
		int ch;
		
		do {
			
			System.out.println("BinaryTree Operation....\n");
			
			System.out.println(" 1.-> PreOrder");
			System.out.println(" 2.-> InOrder");
			System.out.println(" 3.-> PostOrder");
			
			System.out.println(" 4.-> InsertNode");
			System.out.println(" 5.-> Find_Height");
			System.out.println(" 6.-> isIdentical");
			System.out.println(" 7.-> mirrorImage");
			System.out.println(" 8.-> mirrorRec");
			System.out.println(" 111.-> Display-BT");
			
			System.out.println("\n\nBinarySearchTree Operation...\n");
			
			System.out.println(" 11.-> Insert_NonRecursive");
			System.out.println(" 12.-> Insert_Using_Parent");
			System.out.println(" 13.-> Insert_Using_Recursion");
			System.out.println(" 14.-> SearchNode");
			System.out.println(" 15.-> DeleteNode");
			
			System.out.println(" 222.-> Display-BST");
			System.out.println(" 0.-> Exit");
			
			System.out.println("Enter Your Choice...");
			 ch = s.nextInt();
			 
			 
			 switch(ch)
			 {
					 case 1:
					 {
						 System.out.println("************************************************************");
						 System.out.print("PreOrder -> ");
						 bt.PreOrder();
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 2:
					 {
						 System.out.println("************************************************************");
						 System.out.print("InOrder -> ");
						 bt.InOrder();
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 3:
					 {
						 System.out.println("************************************************************");
						 System.out.print("PostOrder -> ");
						 bt.PostOrder();
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 4:
					 {
						 System.out.println("************************************************************");
						 System.out.println("Enter Data...");
						 int d = s.nextInt();
						 bt.Insert_LevelWise(d);
						 System.out.println(d + " Inserted...");
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 5:
					 {
						 System.out.println("************************************************************");
						 
						 int ht = bt.Find_Hight();
						 System.out.println("Binary Tree Height is -> "+ht);
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 6:
					 {
						 int h;
						 System.out.println("************************************************************");
						 do {
							 
							 System.out.println("Enter Data Second Tree...");
							 int d = s.nextInt();
							 bt2.Insert_LevelWise(d);
							 System.out.println(d + " Inserted...\n\n");
							 
							 System.out.println("Enter 1 to continue and 0 to exit...");
							 h = s.nextInt();
							 
						 }while(h != 0);
						 
						 boolean res;
						 res = bt.isIdentical(bt, bt2);
						 
						
						 if(res == true)
						 {
							 System.out.println("Binary Tree Is Identical...");	 
						 }
						 else
						 {
							 System.out.println("Binary Tree Is Not Identical...");	 
						 }
						
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 7:
					 {
						 System.out.println("************************************************************");
						 bt.mirrorImage();
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 8:
					 {
						 System.out.println("************************************************************");
						 bt.mirrorRec();
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 111:
					 {
						 System.out.println("************************************************************");
						 bt.Display();
						 bt2.Display();
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
// **********************************************************************************************************************
					 
					 case 11:
					 {
						 System.out.println("************************************************************");
						 System.out.println("Enter Data...");
						 int d = s.nextInt();
						 bst.Insert_NonRecursive(d);
						 System.out.println(d + " Inserted...");
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 12:
					 {
						 System.out.println("************************************************************");
						 System.out.println("Enter Data...");
						 int d = s.nextInt();
						 bst.Insert_Using_Parent(d);
						 System.out.println(d + " Inserted...");
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 13:
					 {
						 System.out.println("************************************************************");
						 System.out.println("Enter Data...");
						 int d = s.nextInt();
						 bst.Insert_Using_Recursion(d);
						 System.out.println(d + " Inserted...");
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 14:
					 {
						 System.out.println("************************************************************");
						 System.out.println("Enter Key to Find You...");
						 int d = s.nextInt();
						 bst.SearchNode(d);
						 System.out.println(d + " Inserted...");
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 15:
					 {
						 System.out.println("************************************************************");
						 System.out.println("Enter Key to Delete You...");
						 int d = s.nextInt();
						 bst.DeleteNode(d);
						 System.out.println(d + " Deleted...");
						 System.out.println("\n************************************************************");
						 break;
					 }
					 
					 case 222:
					 {
						 System.out.println("************************************************************");
						 bst.Display();
						 System.out.println("\n************************************************************");
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
