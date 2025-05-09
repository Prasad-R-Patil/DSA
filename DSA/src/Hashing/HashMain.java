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
			System.out.println("3. -> DeleteRecord");
			
			System.out.println("11. -> DisplayRecords");
			System.out.println("0. -> Exits");
			
			
			System.out.println("Enter Your Choice....");
			ch = s.nextInt();
			
			
			switch(ch)
			{
					case 1:
					{
						System.out.println("*********************************************************");
						System.out.println("Enter Record To Store in Hash Table");
						
						System.out.println("Enter Student Roll No :- ");
						int id = s.nextInt();
						
						System.out.println("Enter Student Name :- ");
						String nm = s.next();
						
						System.out.println("Enter Student Marks :- ");
						float mks = s.nextFloat();
						
						
						stud = new Student(id,nm,mks);
						
						mh.InsertRecord(stud);
						System.out.println("*********************************************************");
						break;
					}
					
					case 2:
					{
						System.out.println("*********************************************************");
					    System.out.println("Enter Student Roll No to Search :- ");
					    int id = s.nextInt();

					    
					    int index = mh.SearchRecord(id);

					    if (index != -1) {
					      
					        System.out.println("Record Found at index " + index + ":");
					        System.out.print("Roll No: " + mh.table[index].ref.getRollNo());
					        System.out.print("Name   : " + mh.table[index].ref.getName());
					        System.out.print("Marks  : " + mh.table[index].ref.getMarks());
					    } else {
					        System.out.println("Record Not Found");
					    }

					    System.out.println("*********************************************************");
					    break;
					}
					
					case 3:
					{
					    System.out.println("*********************************************************");
					    System.out.println("Enter Student Roll No to Delete :- ");
					    int id = s.nextInt();
					    
					    mh.DeleteRecord(id);

					    System.out.println("*********************************************************");
					    break;
					}
					
					case 11:
					{
						System.out.println("*********************************************************");
						mh.DisplayRecord();
						System.out.println("*********************************************************");
						break;
					}
					
					
					case 0:
					{
						System.out.println("*********************************************************");
						System.out.println("Thank You [ Hashing Operation Completed ]...");
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
