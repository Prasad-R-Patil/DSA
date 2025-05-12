package Exam;

import LinkedList.IntNode;

public class SLL {

	private IntNode head;

	public SLL() {
		head = null;
	}

	public IntNode getHead() {
		return head;
	}

	public void setHead(IntNode head) {
		this.head = head;
	}

	public void InsertFirst(int d) {
		IntNode node = new IntNode(d);

		if (head == null) {
			head = node;
			return;
		}

		node.setNext(head);
		head = node;
		return;

	}

	public void InsertLast(int d) {
		IntNode node = new IntNode(d);

		if (head == null) {
			head = node;
			return;
		}

		IntNode iter = head;

		while (iter.getNext() != null) {
			iter = iter.getNext();
		}

		iter.setNext(node);
		return;

	}

	public void Display() {

		if (head == null) {
			System.out.println("Empty");
			return;
		}

		IntNode iter = head;

		while (iter != null) {
			System.out.print(iter.getData() + " ");
			iter = iter.getNext();
		}

	}

	public int CreateNo(SLL N) {
		int sum = 0;
		IntNode iter = N.getHead();

		while (iter != null) {
			int no = iter.getData();

			sum = sum * 10 + no;

			iter = iter.getNext();
		}
		return sum;
	}

	public void Bay2Get1(SLL s1, SLL s2, SLL res) {
		int num1 = CreateNo(s1);
		int num2 = CreateNo(s2);
		int num3 = num1 + num2;

		while (num3 != 0) {
			int rem = num3 % 10;
			res.InsertFirst(rem);
			num3 = num3 / 10;
		}
	}

	public int Length(SLL s1) {
		int cnt = 0;
		if (s1.getHead() == null) {
			return 0;
		}

		IntNode iter = s1.getHead();

		while (iter != null) {
			cnt++;
			iter = iter.getNext();
		}

		return cnt;
	}

//	public void Split(SLL s1, SLL res1, SLL res2)
//	{
//	    int len = Length(s1);
//	    int pos = len / 2;
//
//	    IntNode iter = s1.getHead();
//
//	    for (int i = 1; i <= pos && iter != null; i++) 
//	    {
//	        res1.InsertLast(iter.getData());
//	        iter = iter.getNext();
//	    }
//
//	    for (int j = pos + 1; j <= len && iter != null; j++) 
//	    {
//	        res2.InsertLast(iter.getData());
//	        iter = iter.getNext();
//	    }
//	}

		public void Split(SLL s1, SLL res1, SLL res2) 
		{ 
			int len = Length(s1); 
			int mid = len / 2;
		  
			  IntNode iter = s1.getHead();
			  int index = 0;
			  
			  while (iter != null) 
			  { 
				  if (index < mid) 
				  { 
					  res1.InsertLast(iter.getData()); 
				  }
			      else 
			      { 
			    	  res2.InsertLast(iter.getData()); 
			      }
			  
			  
			      iter = iter.getNext(); 
			      index++; 
		     } 
		}
		
		public void DeleteMed(SLL s1)
		{
			if(head == null)
			{
				System.out.println("Empty");
				return;
			}
			
			int len = Length(s1);
			int mid = len/2;
			IntNode iter = s1.getHead();
			int index =1;
			
			while(iter != null)
			{
				if(index == mid-1)
				{
					iter.setNext(iter.getNext().getNext());
					return;
				}
				
				iter = iter.getNext();
				index++;
			}
				
		}
		
		
		public void LastPos(SLL s1, int pos)
		{
			int len = Length(s1);
			
			int p = len-pos;
			
			
			if(s1.getHead() == null)
			{
				System.out.println("Empty");
				return;
			}
			
			IntNode iter = s1.getHead();
			int index = 0;
			
			while(iter != null)
			{
				if(p == index)
				{
					System.out.println("My [ "+pos+" ] Last Node is [ "+iter.getData()+" ]...");
					return;
				}
				iter = iter.getNext();
				index++;
			}
			
		}
		
		public IntNode InterSect(SLL s1, SLL s2) 
		{
		    IntNode iter1 = s1.getHead();
		    IntNode iter2 = s2.getHead();

		    while (iter1 != iter2) 
		    {
		        iter1 = (iter1 == null) ? s2.getHead() : iter1.getNext();
		        iter2 = (iter2 == null) ? s1.getHead() : iter2.getNext();
		    }

		    return iter1;
		}
		
		 

}
