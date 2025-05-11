package Exam;

import LinkedList.IntNode;

public class SLLstudent {
	
	private StNode head;
	
	
	public SLLstudent()
	{
		head = null;
	}


	public StNode getHead() 
	{
		return head;
	}


	public void setHead(StNode head) 
	{
		this.head = head;
	}
	
	
	public void InsertFirst(Student s)
	{
		StNode nn = new StNode(s);
		
		if(head == null)
		{
			head = nn;
			return;
		}
		else
		{
			nn.setNext(head);
			head = nn;
			return;
		}
		
	}
	
	public void InsertLast(Student s)
	{
		StNode nn = new StNode(s);
		
		if(head == null)
		{
			head = nn;
			return;
		}
		
		StNode iter = head;
		
		while(iter.getNext() != null)
		{
			iter = iter.getNext();
		}
		
		iter.setNext(nn);
		
		return;
		
	}
	
	
	public StNode Reverse(StNode s)
	{
		StNode iter;
		
		if(s.getNext() == null)
		{
			return s;
		}
		
		else
		{
			iter = Reverse(s.getNext());
			
			s.getNext().setNext(s);
			s.setNext(null);
			
			return iter;
		}
	}
	
	public int cnt;
	public int Length(StNode h)
	{
		
		
		if(h == null)
		{
			System.out.println("Linked list Empty");
			return 0;
		}
		
		return 1 + Length(h.getNext());
		
	}
	
	
	
	public void Display()
	{
		if(head == null)
		{
			System.out.println("Linked List is Empty");
			return;
		}
		
			StNode iter = head;
			
			while(iter != null)
			{
				System.out.println(iter.getData());
				iter = iter.getNext();
			}
			
			
		
	}
	

}
