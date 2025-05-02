package LinkedList;

import java.awt.List;
import java.util.Scanner;

public class MyLinkedList {
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		SingleLinkedList sll = new SingleLinkedList();
		
		int ch;
		
		
		do {
			
			System.out.println("...Operation On Singly Linked List...");
			System.out.println("	1. -> InsertFirst()");
			System.out.println("	2. -> InsertLast()");
			System.out.println("	3. -> Insert_By_Pos()");
			System.out.println("	4. -> DeleteFirst()");
			System.out.println("	5. -> DeleteLast()");
			System.out.println("	6. -> Delete_By_Pos()");
			System.out.println("	7. -> Insert_Before_Data()");
			System.out.println("	8. -> Insert_After_Data()");
			System.out.println("	9. -> Delete_Before_Data()");
			System.out.println("	10. -> Delete_After_Data()");
			System.out.println("	11. -> Display()");
			System.out.println("	12. -> Count_Node()");
			System.out.println("	13. -> Sorted_Inserted()");
			System.out.println("	0. -> Exit");
			
			
			System.out.println("Enter Your Choice... ");
			
			ch = s.nextInt();
			
			
			switch(ch)
			{
			
			
				case 1:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To InsertFirst in Linked-List");
					int v = s.nextInt();
					
					sll.InsertFirst(v);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 2:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To InsertLast in Linked-List");
					int v = s.nextInt();
					
					sll.InsertLast(v);
					System.out.println("*********************************************************");
					break;
				}
				
				
				case 3:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Insert in Linked-List");
					int d = s.nextInt();
					System.out.println("Enter Position To Insert Value in Linked-List");
					int p = s.nextInt();
					sll.Insert_By_Pos(d, p);
					System.out.println("*********************************************************");
					break;
				}
				
				case 4:
				{
					System.out.println("*********************************************************");
				
					int d = sll.DeleteFirst();
					
					System.out.println(d +" -> Deleted First...");
					System.out.println("*********************************************************");
					break;
				}
				
				case 5:
				{
					System.out.println("*********************************************************");
					
					int d = sll.DeleteLast();
					
					System.out.println(d +" -> Deleted Last...");
					System.out.println("*********************************************************");
					break;
				}
				
				case 6:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Position To Delete Node in Linked-List");
					int p = s.nextInt();
					
					sll.Delete_By_Pos(p);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 7:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Insert in Linked-List");
					int d = s.nextInt();
					System.out.println("Enter Key To Insert Value Before in Linked-List");
					int k = s.nextInt();
					sll.Insert_Before_Data(d, k);
					System.out.println("*********************************************************");
					break;
				}
				
				case 8:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Insert in Linked-List");
					int d = s.nextInt();
					System.out.println("Enter Key To Insert Value After in Linked-List");
					int k = s.nextInt();
					sll.Insert_After_Data(d, k);
					System.out.println("*********************************************************");
					break;
				}
				
				case 9:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Key To Delete Value Before in Linked-List");
					int k = s.nextInt();
					int d = sll.Delete_Before_Data(k);
					System.out.println(d + " Deleted...");
					System.out.println("*********************************************************");
					break;
				}
				
				case 10:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Key To Delete Value After in Linked-List");
					int k = s.nextInt();
					int d = sll.Delete_After_Data(k);
					System.out.println(d + " Deleted...");
					System.out.println("*********************************************************");
					break;
				}
				
				case 11:
				{
					System.out.println("*********************************************************");
					sll.Display();
					System.out.println("\n*********************************************************");
					break;
				}
				
				case 12:
				{
					System.out.println("*********************************************************\n");
					int c = sll.Count_Node();
					System.out.println(c + " => Number Of Node Avaible in Single Linked List... ");
					System.out.println("\n*********************************************************");
					break;
				}
				
				case 13:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Insert in Linked-List");
					int v = s.nextInt();
					
					sll.Sorted_Inserted(v);
					System.out.println("*********************************************************");
					break;
				}
				
				case 0:
				{
					System.out.println("*********************************************************");
					System.out.println("Thank You [ SingleLinkedList Operation Completed ]...");
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
