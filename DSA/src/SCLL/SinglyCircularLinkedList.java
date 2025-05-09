package SCLL;

import LinkedList.*;
public class SinglyCircularLinkedList {
	
	private IntNode last;
	
	public SinglyCircularLinkedList()
	{
		last = null;
	}
	
	
	public IntNode getLast() {
		return last;
	}


	public void setLast(IntNode last) {
		this.last = last;
	}

	
	
	
	

	public void InsertFirst(int d)
	{
		IntNode new_node = new IntNode(d);
		
		if(last == null)
		{
			last = new_node;
			last.setNext(new_node);
			
			return;
		}
		
		else
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			
		}
	}
	
	
	public void InsertLast(int d) 
	{
		
		IntNode new_node = new IntNode(d);
		
		if(last == null)
		{
			last = new_node;
			last.setNext(new_node);
			
			return;
		}
		
		else
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			last = new_node;
			
			return;
		}
		
		
		
	}
	
	public int DeleteFirst()
	{
		
		if(last == null)
		{
			System.out.println("Linked List Empty...");
			return -999;
		}
		
		if(last.getNext() == last)
		{
			int d = last.getData();
			last.setNext(null);
			last = null;
			
			return d;
		}
		
		int d = last.getNext().getData();
		last.setNext(last.getNext().getNext());
		
		return d;
	}
	
	public int DeleteLast()
	{
		if(last == null)
		{
			System.out.println("Linked List Empty...");
			return -999;
		}
		
		if(last.getNext() == last)
		{
			int d = last.getData();
			last.setNext(null);
			last = null;
			
			return d;
		}
		
		IntNode iter = last.getNext();
		
		while(iter.getNext() != last)
		{
			iter = iter.getNext();
		}
		
		int d = iter.getNext().getData();
		iter.setNext(iter.getNext().getNext());
		last = iter;
		return d;
	}
	
	
	public void InsertByPos(int d , int pos)
	{
         IntNode new_node = new IntNode(d);

		if(last == null)
		{
			last = new_node;
			last.setNext(new_node);
			return;
		}
		
		if(pos == 1)
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			
			return;
		}

		IntNode iter = last.getNext();

		int i;
		for(i = 1; i < ( pos-1 ) && (iter != last); i++ )
		{
			iter = iter.getNext();
		}
		
		if(last == iter )
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			last = new_node;
			return;
		}
		else
		{
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			
			return;
		}
		
	}
	

	
	public void Display()
	{
		if(last == null)
		{
			System.out.println("Linked List is Empty...");
			
			return;
		}
		
		IntNode iter = last.getNext();
		
		do {
			
			System.out.print(iter.getData() + " ");
			
			iter = iter.getNext();
			
		}while(iter != last.getNext());
	}
	

}
