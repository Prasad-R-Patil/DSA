package Exam;

import java.util.Scanner;



public class MainBT {
	
	public static void main(String[] args) {
	
			
			Scanner s = new Scanner(System.in);
			
			BT bt = new BT();
			BST bst = new BST();
			
			
			int ch;
			
			
			do {
				
				System.out.println("...Operation On Binary Tree ...");
				System.out.println("1. -> insert");
				System.out.println("2. -> PreOrder");
				System.out.println("3. -> InOrder");
				System.out.println("4. -> PostOrder");
				System.out.println("5. -> Hight");
				System.out.println("11.-> Display");
				System.out.println("-------------------------");
				
				System.out.println("6. -> InsertBST");
				System.out.println("7. -> InsertBSTrecv");
				System.out.println("111. -> Display");
				
				
				System.out.println("0. -> Exit");
				
				
				System.out.println("Enter Your Choice... ");
				
				ch = s.nextInt();
				
				
				switch(ch)
				{
				
				
					case 1:
					{
						System.out.println("*********************************************************");
						System.out.println("Enter Data...");
						int d = s.nextInt();
						bt.insertLVL(d);
						System.out.println("*********************************************************");
						break;
						
					}
					
					
					case 2:
					{
						System.out.println("*********************************************************");
						
						bt.PreOreder();
						System.out.println();
						
						System.out.println("*********************************************************");
						break;
						
					}
					
					case 3:
					{
						System.out.println("*********************************************************");
						
						bt.InOrder();
						System.out.println();
						
						System.out.println("*********************************************************");
						break;
						
					}
					
					case 4:
					{
						System.out.println("*********************************************************");
						
						bt.PostOrder();
						System.out.println();
						
						System.out.println("*********************************************************");
						break;
						
					}
					
					case 5:
					{
						System.out.println("*********************************************************");
					
						int h = bt.hight();
						System.out.println(h+" Hight...");
						System.out.println("*********************************************************");
						break;
						
					}
					
					case 11:
					{
						System.out.println("*********************************************************");
						bt.Display();
						System.out.println();
						System.out.println("*********************************************************");
						break;
					}
					
					case 6:
					{
						System.out.println("*********************************************************");
						System.out.println("Enter Data...");
						int d = s.nextInt();
						bst.Insert(d);
						System.out.println("*********************************************************");
						break;
						
					}
					case 7:
					{
						System.out.println("*********************************************************");
						System.out.println("Enter Data...");
						int d = s.nextInt();
						bst.InsertRec(d);
						System.out.println("*********************************************************");
						break;
						
					}
					case 111:
					{
						System.out.println("*********************************************************");
						bst.Display();
						System.out.println();
						System.out.println("*********************************************************");
						break;
					}

					
					case 0:
					{
						System.out.println("*********************************************************");
						System.out.println("Thank You [ Binary Tree Operation Completed ]...");
						System.out.println("*********************************************************");
						break;
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
			
			
			
		
		
		
		
	}

}
