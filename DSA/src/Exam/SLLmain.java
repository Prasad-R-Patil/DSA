package Exam;

import LinkedList.IntNode;

public class SLLmain {
	
	public static void main(String[] args) {
		
		SLL sl = new SLL();
		SLL sl2 = new SLL();
		SLL res = new SLL();
		
		sl.InsertLast(1);
		sl.InsertLast(5);
		sl.InsertLast(6);
		sl.InsertLast(7);
		sl.InsertLast(8);
		
		sl. Display();
		System.out.println();
		
		sl2.InsertLast(2);
		sl2.InsertLast(5);
		sl2.InsertLast(6);
		sl2.InsertLast(9);
		sl2.InsertLast(4);
		sl2.InsertLast(2);
		
		sl2.Display();
		System.out.println();
		
		sl.Bay2Get1(sl,sl2,res);
		System.out.println();
		
		res.Display();
		
		SLL sl3 = new SLL();
		
		sl3.InsertLast(12);
		sl3.InsertLast(15);
		sl3.InsertLast(16);
		sl3.InsertLast(11);
		sl3.InsertLast(2);
		sl3.InsertLast(4);
		sl3.InsertLast(10);
		sl3.InsertLast(22);
		sl3.InsertLast(32);
		sl3.InsertLast(44);
		
		SLL res1 = new SLL();
		SLL res2 = new SLL();
		
		sl3.Split(sl3, res1, res2);
		System.out.println();
		sl3.Display();
		System.out.println();
		res1.Display();
		System.out.println();
		res2.Display();
		System.out.println("\n--------------");
		
		sl3.Display();
		System.out.println();
		sl3.DeleteMed(sl3);
		System.out.println();
		sl3.Display();
		
		System.out.println();
		System.out.println("\n--------------");
		sl3.LastPos(sl3, 4);
		System.out.println("\n--------------");
		SLL s1 = new SLL();
        SLL s2 = new SLL();

      
        IntNode common = new IntNode(99);
        common.setNext(new IntNode(100));

        // First list: 10 -> 20 -> 30 -> 99 -> 100
        s1.InsertLast(10);
        s1.InsertLast(20);
        s1.InsertLast(30);

        IntNode temp = s1.getHead();
        while (temp.getNext() != null) temp = temp.getNext();
        temp.setNext(common);  // Link to common part

        // Second list: 40 -> 50 -> 99 -> 100
        s2.InsertLast(40);
        s2.InsertLast(50);

        temp = s2.getHead();
        while (temp.getNext() != null) temp = temp.getNext();
        temp.setNext(common);  // Link to common part

        
        IntNode result = s1.InterSect(s1, s2);

        if (result != null) 
        {
            System.out.println("Intersection at node with data: " + result.getData());
        } 
        else 
        {
            System.out.println("No intersection found.");
        }
		
		
		
	}

}
