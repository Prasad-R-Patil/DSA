package Stack;

import java.util.Scanner;

public class MyStack {
	
	
/*
 
  	// Integer Stack...
  	
  	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		IntStack is = new IntStack();
		
		int ch;
		
		
		do {
			
			System.out.println("Menu");
			System.out.println("1. -> Push()");
			System.out.println("2. -> Pop()");
			System.out.println("3. -> Peek()");
			System.out.println("4. -> isFull()");
			System.out.println("5. -> isEmpty()");
			System.out.println("6. -> Display()");
			System.out.println("7. -> Exit");
			
			
			System.out.println("Enter Your Choice (1..7) ");
			
			ch = s.nextInt();
			
			
			switch(ch)
			{
			
			
				case 1:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Push in Stack");
					int v = s.nextInt();
					
					is.push(v);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 2:
				{
					System.out.println("*********************************************************");
					int p = is.pop();
					System.out.println(p);
					System.out.println("*********************************************************");
					break;
				}
				
				
				case 3:
				{
					System.out.println("*********************************************************");
					int pe = is.peek();
					System.out.println(pe);
					System.out.println("*********************************************************");
					break;
				}
				
				case 4:
				{
					System.out.println("*********************************************************");
					boolean f = is.isFull();
					if(f == true)
					{
						System.out.println("Stack is Full");
					}
					else
					{
						System.out.println("Stack is Not Full");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 5:
				{
					System.out.println("*********************************************************");
					boolean e = is.isEmpty();
					if(e == true)
					{
						System.out.println("Stack is Empty");
					}
					else
					{
						System.out.println("Stack is Not Empty");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 6:
				{
					System.out.println("*********************************************************");
					is.Display();
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 7:
				{
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
			
			
			
		}while(ch != 7);
		
		System.out.println("*********************************************************");
		System.out.println("Thank You [ Stack Operation Completed ]...");
		System.out.println("*********************************************************");
		
	}*/
	
	
	/*
	// Character Stack...
	
	
	
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		CharStack is = new CharStack();
		
		int ch;
		
		
		do {
			
			System.out.println("Menu");
			System.out.println("1. -> Push()");
			System.out.println("2. -> Pop()");
			System.out.println("3. -> Peek()");
			System.out.println("4. -> isFull()");
			System.out.println("5. -> isEmpty()");
			System.out.println("6. -> Display()");
			System.out.println("7. -> Exit");
			
			
			System.out.println("Enter Your Choice (1..7) ");
			
			ch = s.nextInt();
			
			
			switch(ch)
			{
			
			
				case 1:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Push in Stack");
					char v = s.next().charAt(0);
					
					is.push(v);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 2:
				{
					System.out.println("*********************************************************");
					char p = is.pop();
					System.out.println(p);
					System.out.println("*********************************************************");
					break;
				}
				
				
				case 3:
				{
					System.out.println("*********************************************************");
					char pe = is.peek();
					System.out.println(pe);
					System.out.println("*********************************************************");
					break;
				}
				
				case 4:
				{
					System.out.println("*********************************************************");
					boolean f = is.isFull();
					if(f == true)
					{
						System.out.println("Stack is Full");
					}
					else
					{
						System.out.println("Stack is Not Full");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 5:
				{
					System.out.println("*********************************************************");
					boolean e = i2Cs.isEmpty();
					if(e == true)
					{
						System.out.println("Stack is Empty");
					}
					else
					{
						System.out.println("Stack is Not Empty");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 6:
				{
					System.out.println("*********************************************************");
					is.Display();
					System.out.println("*********************************************************");
					break;
					
				}
				case 7:
				{
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
			
			
			
		}while(ch != 7);
		
		System.out.println("*********************************************************");
		System.out.println("Thank You [ Stack Operation Completed ]...");
		System.out.println("*********************************************************");
		
		
	}*/
	
	
	/*
	// Student Stack
	
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		StudentStack is = new StudentStack();
		
		int ch;
		
		
		do {
			
			System.out.println("Menu");
			System.out.println("1. -> Push()");
			System.out.println("2. -> Pop()");
			System.out.println("3. -> Peek()");
			System.out.println("4. -> isFull()");
			System.out.println("5. -> isEmpty()");
			System.out.println("6. -> Display()");
			System.out.println("7. -> Exit");
			
			
			System.out.println("Enter Your Choice (1..7) ");
			
			ch = s.nextInt();
			
			
			switch(ch)
			{
			
			
				case 1:
				{
					
					
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Push in Stack");
					
					System.out.println("Enter Student Roll No :- ");
					int id = s.nextInt();
					
					System.out.println("Enter Student Name :- ");
					String nm = s.next();
					
					System.out.println("Enter Student Marks :- ");
					float mks = s.nextFloat();
					
					
					Student stu = new Student(id,nm,mks);
					
					is.push(stu);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 2:
				{
					System.out.println("*********************************************************");
					Student p = is.pop();
					System.out.println(p);
					System.out.println("*********************************************************");
					break;
				}
				
				
				case 3:
				{
					System.out.println("*********************************************************");
					Student pe = is.peek();
					System.out.println(pe);
					System.out.println("*********************************************************");
					break;
				}
				
				case 4:
				{
					System.out.println("*********************************************************");
					boolean f = is.isFull();
					if(f == true)
					{
						System.out.println("Stack is Full");
					}
					else
					{
						System.out.println("Stack is Not Full");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 5:
				{
					System.out.println("*********************************************************");
					boolean e = is.isEmpty();
					if(e == true)
					{
						System.out.println("Stack is Empty");
					}
					else
					{
						System.out.println("Stack is Not Empty");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 6:
				{
					System.out.println("*********************************************************");
					is.Display();
					System.out.println("*********************************************************");
					break;
					
				}
				case 7:
				{
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
			
			
			
		}while(ch != 7);
		
		System.out.println("*********************************************************");
		System.out.println("Thank You [ Stack Operation Completed ]...");
		System.out.println("*********************************************************");
		
		
	} */
	
	
	
	
	// Integer 2C_Stack...
  	
  	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		Int_2C_Stack i2Cs = new Int_2C_Stack();
		
		int ch;
		
		
		do {
			
			System.out.println("========>[ Menu A]<=========");
			System.out.println("1. -> PushA()");
			System.out.println("2. -> PopA()");
			System.out.println("3. -> PeekA()");
			System.out.println("4. -> isFullA()");
			System.out.println("5. -> isEmptyA()");
			System.out.println("6. -> DisplayA()");
			
			System.out.println("========>[ Menu B]<=========");
			System.out.println("11. -> PushB()");
			System.out.println("22. -> PopB()");
			System.out.println("33. -> PeekB()");
			System.out.println("44. -> isFullB()");
			System.out.println("55. -> isEmptyB()");
			System.out.println("66. -> DisplayB()");
			
			
			
			
			
			System.out.println("777. -> Exit");
			
			
			System.out.println("Enter Your Choice from the Menu (Enter 777 to exit) ");
			
			ch = s.nextInt();
			
			
			switch(ch)
			{
			
				// For A in 2C-Stack
			
				case 1:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Push in Stack-A");
					int v = s.nextInt();
					
					i2Cs.pushA(v);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 2:
				{
					System.out.println("*********************************************************");
					int p = i2Cs.popA();
					System.out.println(p);
					System.out.println("*********************************************************");
					break;
				}
				
				
				case 3:
				{
					System.out.println("*********************************************************");
					int pe = i2Cs.peekA();
					System.out.println(pe);
					System.out.println("*********************************************************");
					break;
				}
				
				case 4:
				{
					System.out.println("*********************************************************");
					boolean f = i2Cs.isFullA();
					if(f == true)
					{
						System.out.println("Stack-A is Full");
					}
					else
					{
						System.out.println("Stack-A is Not Full");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 5:
				{
					System.out.println("*********************************************************");
					boolean e = i2Cs.isEmptyA();
					if(e == true)
					{
						System.out.println("Stack-A is Empty");
					}
					else
					{
						System.out.println("Stack-A is Not Empty");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 6:
				{
					System.out.println("*********************************************************");
					i2Cs.DisplayA();
					System.out.println("*********************************************************");
					break;
					
				}
				
				
				// For B in 2C-Stack
				
				case 11:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Push in Stack-B");
					int v = s.nextInt();
					
					i2Cs.pushB(v);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 22:
				{
					System.out.println("*********************************************************");
					int p = i2Cs.popB();
					System.out.println(p);
					System.out.println("*********************************************************");
					break;
				}
				
				
				case 33:
				{
					System.out.println("*********************************************************");
					int pe = i2Cs.peekB();
					System.out.println(pe);
					System.out.println("*********************************************************");
					break;
				}
				
				case 44:
				{
					System.out.println("*********************************************************");
					boolean f = i2Cs.isFullB();
					if(f == true)
					{
						System.out.println("Stack-B is Full");
					}
					else
					{
						System.out.println("Stack-B is Not Full");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 55:
				{
					System.out.println("*********************************************************");
					boolean e = i2Cs.isEmptyB();
					if(e == true)
					{
						System.out.println("Stack-B is Empty");
					}
					else
					{
						System.out.println("Stack-B is Not Empty");
					}
					System.out.println("*********************************************************");
					break;
				}
				
				case 66:
				{
					System.out.println("*********************************************************");
					i2Cs.DisplayB();
					System.out.println("*********************************************************");
					break;
					
				}
				
				
				
				
				
				
				case 777:
				{
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
			
			
			
		}while(ch != 777);
		
		System.out.println("*********************************************************");
		System.out.println("Thank You Your -> 2C-Stack Operation Completed...");
		System.out.println("*********************************************************");
		
	
	}
	
	

}

