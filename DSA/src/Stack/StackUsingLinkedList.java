package Stack;

import LinkedList.SinglyLinkedList;

public class StackUsingLinkedList 
{
    
	    private SinglyLinkedList sll = new SinglyLinkedList();
	
	    public void push(int data) 
	    {
	        sll.InsertLast(data); 
	    }
	
	    public int pop() 
	    {
	        return sll.DeleteLast(); 
	    }
	
	    public int peek() 
	    {
	        if (sll.getHead() == null) 
	        {
	            System.out.println("Stack is empty...");
	            return -999;
	        }
	        
	        return sll.getLast(); 
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
