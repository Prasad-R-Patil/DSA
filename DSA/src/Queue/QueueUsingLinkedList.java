package Queue;

import LinkedList.SinglyLinkedList;

public class QueueUsingLinkedList 
{
	
	SinglyLinkedList sll = new SinglyLinkedList();
	
	
	public void Insert(int d)
	{
		sll.InsertLast(d);
	}
	
	public int Remove()
	{
		return sll.DeleteFirst();
	}
	
	public int Peek()
	{
		return sll.getFirst();
	}
	
	 public boolean isEmpty() 
	 {
	    return sll.getHead() == null;
	 }
	 
	 
	public void Display()
	{
		sll.Display();
	}
	

}
