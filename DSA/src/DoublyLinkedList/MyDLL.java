package DoublyLinkedList;

import java.util.Scanner;

import SCLL.SinglyCircularLinkedList;

public class MyDLL 
{
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		int ch;
		DoublyLinkedList dll = new DoublyLinkedList();
		
		
		do {
			System.out.println("SinglyCircularLinkedList Operation");
			
			System.out.println(" 1.-> InsertFirst...");
			System.out.println(" 2.-> InsertLast...");
			System.out.println(" 3.-> DeleteFirst...");
			System.out.println(" 4.-> DeleteLast...");
			
			System.out.println(" 11.-> Display...");
			System.out.println(" 0.-> Exit");
			
			
			System.out.println("Enter Your Choice....");
			ch = s.nextInt();			
			
		
		
		
		switch(ch)
		{
		
				case 1:
				{
					
					System.out.println("Enter Data to Add Linked List");
					int d=s.nextInt();
					
					dll.InsertFirst(d);
					System.out.println(" Inserted...");
					
					break;
				}
				case 2:
				{
					
					System.out.println("Enter Data to Add Linked List");
					int d=s.nextInt();
					
					dll.InsertLast(d);
					System.out.println(" Inserted...");
					
					break;
				}
				
				case 3:
				{
					
					int d = dll.DeleteFirst();
					System.out.println(d + " Deleted...");
					
					break;
				}
				
				case 4:
				{
					
					int d = dll.DeleteLast();
					System.out.println(d + " Deleted...");
					
					break;
				}
				
				
				case 11:
				{
					
					System.out.print("List =-> ");
					dll.Display();
					System.out.println();
					break;
				}
				
				
				case 0:
				{
					System.out.println("*********************************************************");
					System.out.println("Thank You [ SinglyLinkedList Operation Completed ]...");
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
