package Recursion;

import LinkedList.*;

public class List {

	public static void Display(IntNode iter) {

		if (iter == null) {
			return;
		}
		Display(iter.getNext());
		System.out.print(iter.getData() + " ");
	}

	
	  public static IntNode Reverse(IntNode h) 
		  { 
			  IntNode iter;
		  
			  if(h.getNext() == null) 
			  { 
				  return h; 
			  }
		 
			  else 
			  { 
				  iter = Reverse(h.getNext()); 
				  h.getNext().setNext(h);
				  h.setNext(null); 
				  return iter; 
			  }
	  
	  }
	  
	  public static int length(IntNode p)
	  {
		  if(p == null)
		  {
			  return 0;
		  }
		  
		  return 1 + length(p.getNext());
	  }
	 
	  
	  public static  int sum_nodes(IntNode p)
	  {
		  if(p == null) 
		  {
			  return 0;
		  }
		  
		  return p.getData() + sum_nodes(p.getNext());
		  
	  }
	  
	  

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
	

		sll.InsertLast(10);
		sll.InsertLast(20);
		sll.InsertLast(30);
		sll.InsertLast(40);
		sll.InsertLast(50);
		sll.InsertLast(60);
		sll.InsertLast(70);
		sll.InsertLast(80);
		sll.InsertLast(90);
		sll.InsertLast(100);
		
		sll.setHead(Reverse(sll.getHead()));

		System.out.print("List -> ");
		List.Display(sll.getHead());
		
		System.out.println();
		System.out.println();
		System.out.println("Length is -> "+List.length(sll.getHead()));
		
		System.out.println();
		System.out.println("sum_nodes is -> "+List.sum_nodes(sll.getHead()));
		
	}

}
