package Exam;

import java.util.Scanner;



public class StudQueueMain {
	
	public static void main(String[] args) {
	
			
			Scanner s = new Scanner(System.in);
			
			StudQueue ss = new StudQueue();
			Student stud ;
			
			int ch;
			
			
			do {
				
				System.out.println("...Operation On Student Queue...");
				System.out.println("1. -> add");
				System.out.println("2. -> remove");
				System.out.println("3. -> peek");
				System.out.println("4. -> Lengeth");
				System.out.println("11. -> Display");
				
				
				System.out.println("0. -> Exit");
				
				
				System.out.println("Enter Your Choice... ");
				
				ch = s.nextInt();
				
				
				switch(ch)
				{
				
				
					case 1:
					{
						System.out.println("*********************************************************");
						System.out.println("Enter Value To InsertFirst in Linked-List");


						System.out.println("Enter Student Roll No :- ");
						int id = s.nextInt();
						
						System.out.println("Enter Student Name :- ");
						String nm = s.next();
						
						System.out.println("Enter Student Marks :- ");
						float mks = s.nextFloat();
						
						
						stud = new Student(id,nm,mks);
						
						ss.add(stud);
						System.out.println("*********************************************************");
						break;
						
					}
					
					
					case 2:
					{
						System.out.println("*********************************************************");
						
						System.out.println(ss.remove());
						
						System.out.println("*********************************************************");
						break;
						
					}
					
					case 3:
					{
						System.out.println("*********************************************************");
						System.out.println(ss.peek());
						System.out.println("peek...");
						System.out.println("*********************************************************");
						break;
						
					}
					case 4:
					{
						System.out.println("*********************************************************");
					
						
						System.out.println(" Lengeth...");
						System.out.println("*********************************************************");
						break;
						
					}
					
					case 11:
					{
						System.out.println("*********************************************************");
						ss.Display();
						System.out.println("*********************************************************");
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
