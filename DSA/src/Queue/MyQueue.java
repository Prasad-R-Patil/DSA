package Queue;

import java.util.Scanner;

public class MyQueue {
	
/*
	// Interger Linear Queue...
	
	public static void main(String[] args) {
		
		IntLineaeQueue iq = new IntLineaeQueue();
				
		Scanner s = new Scanner(System.in);
		int ch;
		
		
		do {
			System.out.println("======================================================================");
			
			System.out.println("========[Menu]========");
			
			System.out.println("1. Insert()");
			System.out.println("2. Remove()");
			System.out.println("3. Peek()");
			System.out.println("4. isFull()");
			System.out.println("5. isEmpty()");
			System.out.println("6. Display()");
			System.out.println("7. Exit()");
			System.out.println("======================================================================");
			System.out.println("Enter Your Choice.....");
			ch = s.nextInt();
			System.out.println("======================================================================");
			switch(ch)
			{
				case 1:
				{
					System.out.println("======================================================================");
					System.out.println("Enter Value to insert in Queue...");
					int d = s.nextInt();
					iq.Insert(d);
					System.out.println("inserted...");
					System.out.println("======================================================================");
					break;
				}
				
				case 2:
				{
					System.out.println("======================================================================");
					int d = iq.Remove();
					System.out.println(d +" Removed...");
					System.out.println("======================================================================");
					break;
				}
				case 3:
				{
					System.out.println("======================================================================");
					int d = iq.Peek();
					System.out.println(d +" Peek Data...");
					System.out.println("======================================================================");
					break;
				}
				case 4:
				{
					System.out.println("======================================================================");
					boolean d = iq.isFull();
					
					if(d == true)
					{
						System.out.println(" Queue is Full...");
					}
					else
					{
							System.out.println(" Queue is Not Full...");
					}
					System.out.println("======================================================================");
					break;
				}
				case 5:
				{
					System.out.println("======================================================================");
					boolean d = iq.isEmpty();
					
					if(d == true)
					{
						System.out.println(" Queue is Empty...");
					}
					else
					{
							System.out.println(" Queue is Not Empty...");
					}
					System.out.println("======================================================================");
					break;
				}
				case 6:
				{
					System.out.println("======================================================================");
					iq.Display();
					System.out.println("======================================================================");
					break;
				}
				case 7:
				{
					System.out.println("======================================================================");
					System.out.println("Thank You Your -> Queue Operation Completed...");
					System.out.println("======================================================================");
					break;
				}
				default:
				{
					System.out.println("Enter Valid Choice.....");
				}
			}
			
			
			
			
			
		}while(ch != 7);
		

		
	}*/
	
	
	// Interger Linear Queue...
	public static void main(String[] args) {
		
		
		IntCircularQueue icq = new IntCircularQueue();
					
			Scanner s = new Scanner(System.in);
			int ch;
			
			
			do {
				System.out.println("======================================================================");
				
				System.out.println("========[Menu]========");
				
				System.out.println("1. Insert()");
				System.out.println("2. Remove()");
				System.out.println("3. Peek()");
				System.out.println("4. isFull()");
				System.out.println("5. isEmpty()");
				System.out.println("6. Display()");
				System.out.println("7. Exit()");
				System.out.println("======================================================================");
				System.out.println("Enter Your Choice.....");
				ch = s.nextInt();
				System.out.println("======================================================================");
				switch(ch)
				{
					case 1:
					{
						System.out.println("======================================================================");
						System.out.println("Enter Value to insert in Queue...");
						int d = s.nextInt();
						icq.Insert(d);
						System.out.println("inserted...");
						System.out.println("======================================================================");
						break;
					}
					
					case 2:
					{
						System.out.println("======================================================================");
						int d = icq.Remove();
						System.out.println(d +" Removed...");
						System.out.println("======================================================================");
						break;
					}
					case 3:
					{
						System.out.println("======================================================================");
						int d = icq.Peek();
						System.out.println(d +" Peek Data...");
						System.out.println("======================================================================");
						break;
					}
					case 4:
					{
						System.out.println("======================================================================");
						boolean d = icq.isFull();
						
						if(d == true)
						{
							System.out.println(" Queue is Full...");
						}
						else
						{
								System.out.println(" Queue is Not Full...");
						}
						System.out.println("======================================================================");
						break;
					}
					case 5:
					{
						System.out.println("======================================================================");
						boolean d = icq.isEmpty();
						
						if(d == true)
						{
							System.out.println(" Queue is Empty...");
						}
						else
						{
								System.out.println(" Queue is Not Empty...");
						}
						System.out.println("======================================================================");
						break;
					}
					case 6:
					{
						System.out.println("======================================================================");
						icq.Display();
						System.out.println("======================================================================");
						break;
					}
					case 7:
					{
						System.out.println("======================================================================");
						System.out.println("Thank You Your -> Queue Operation Completed...");
						System.out.println("======================================================================");
						break;
					}
					default:
					{
						System.out.println("Enter Valid Choice.....");
					}
				}
				
				
				
				
				
			}while(ch != 7);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
