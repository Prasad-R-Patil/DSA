package SCLL;

import java.util.Scanner;
public class MySCLinkedList {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ch;
		SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
		
		
		do {
			System.out.println("SinglyCircularLinkedList Operation");
			
			System.out.println(" 1.-> InsertFirst...");
			System.out.println(" 2.-> InsertLast...");
			System.out.println(" 3.-> DeleteFirst...");
			System.out.println(" 4.-> DeleteLast...");
			System.out.println(" 5.-> InsertByPos...");
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
					
					scll.InsertFirst(d);
					System.out.println(" Inserted...");
					
					break;
				}
				case 2:
				{
					
					System.out.println("Enter Data to Add Linked List");
					int d=s.nextInt();
					
					scll.InsertLast(d);
					System.out.println(" Inserted...");
					
					break;
				}
				
				case 3:
				{
					int d =scll.DeleteFirst();
					System.out.println(d +" Deleted...");
					
					break;
				}
				case 4:
				{
					int d =scll.DeleteLast();
					System.out.println(d +" Deleted...");
					
					break;
				}
				
				case 5:
				{
					System.out.println("Enter Data to Add Linked List");
					int d=s.nextInt();
					
					System.out.println("Enter Position....");
					int p=s.nextInt();
					
					scll.InsertByPos(d, p);
					System.out.println(" Inserted...");
					break;
				}
				
				case 11:
				{
					
					System.out.print("List =-> ");
					scll.Display();
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
