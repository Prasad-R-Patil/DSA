package Exam;

import java.util.Scanner;



public class MainBST {
	
	public static void main(String[] args) {
	
			
			Scanner s = new Scanner(System.in);
			
			
			BST bst = new BST();
			BST bst2 = new BST();
			
			bst2.Insert(45);
			bst2.Insert(40);
			bst2.Insert(45);
			
			int ch;
			
			
			do {
				
				System.out.println("3. -> SumOfLeaf_NonLeaf");
				System.out.println("4. -> SumAvgCountOfNode");
				System.out.println("5. -> MaxMin");
				System.out.println("6. -> InsertBST");
				System.out.println("7. -> InsertBSTrecv");
				System.out.println("8. -> HightRec");
				System.out.println("9. -> FindSubTree");
				System.out.println("111. -> Display");
				
				
				System.out.println("0. -> Exit");
				
				
				System.out.println("Enter Your Choice... ");
				
				ch = s.nextInt();
				
				
				switch(ch)
				{
				
				
				
				case 3:
				{
					System.out.println("*********************************************************");
					bst.SumOfLeaf_NonLeaf();
					System.out.println();
					System.out.println("*********************************************************");
					break;
				}	
				case 4:
				{
					System.out.println("*********************************************************");
					bst.SumAvgCountOfNode();
					System.out.println();
					System.out.println("*********************************************************");
					break;
				}
				case 5:
				{
					System.out.println("*********************************************************");
					bst.MaxMin();
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
					
					case 8:
					{
						System.out.println("*********************************************************");
						
						int h = bst.HightRec();
						System.out.println(h+" Height...");
						System.out.println("*********************************************************");
						break;
						
					}
					
					case 9:
					{
						System.out.println("*********************************************************");
						
						System.out.println(bst.FindSubTree(bst.getRoot(), bst2.getRoot()));
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
