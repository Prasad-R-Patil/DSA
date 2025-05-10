package Hashing;

import java.util.Scanner;

import Stack.Student;

public class HashMain {
	
	public static void main(String[] args) {
		
		Student stud;
		MyHash mh = new MyHash();
		
		int ch;
		Scanner s = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Hashing Operation...");
			
			System.out.println("1. -> InsertRecord");
			System.out.println("2. -> SearchRecord");
			
			System.out.println("11. -> DisplayRecords");
			System.out.println("0. -> Exits");
			
			
			System.out.println("Enter Your Choice....");
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
						
						
						stud = new Student(id,nm,mks);
						
						mh.Insert(stud);
						System.out.println("*********************************************************");
						break;
					}
					
					case 2:
					{
						mh.SearchRecord(ch);
					}
					
					
					case 0:
					{
						System.out.println("Thank You [ Hashing Operation Completed ]...");
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
