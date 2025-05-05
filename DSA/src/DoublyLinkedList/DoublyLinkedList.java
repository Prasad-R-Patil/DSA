package DoublyLinkedList;

public class DoublyLinkedList 
{
	
	private DintNode head;
	
	
	public DoublyLinkedList()
	{
		head = null;
	}
	
	
	
	public DintNode getHead() 
	{
		return head;
	}



	public void setHead(DintNode head) 
	{
		this.head = head;
	}



	public void InsertFirst(int d)
	{
		DintNode new_node = new DintNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head.setPrev(new_node);
		head = new_node;
		return;
	}
	
	public void InsertLast(int d)
	{
		DintNode new_node = new DintNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		DintNode iter = head;
		
		while(iter.getNext() != null)
		{
			iter = iter.getNext();
		}
		
		new_node.setPrev(iter);
		iter.setNext(new_node);
		return;
		
	}
	
	public int DeleteFirst()
	{
		if(head == null)
		{
			System.out.println("DLL is Empty...");
			return -999;
		}
		
		int d = head.getData();
		DintNode deleteble = head.getNext();
	
	    if (head.getNext() == null) 
	    {
	        
	        head = null;
	    } 
	    else 
	    {
	        
	        head = head.getNext();
	        head.setPrev(null);
	        deleteble = null;
	    }
		
		return d;
		
	}
	
	public int DeleteLast()
	{
		if (head == null) 
		{
	        System.out.println("DLL is Empty...");
	        return -999;
	    }

	    DintNode iter = head;

	    
	    if (iter.getNext() == null) 
	    {
	        int d = iter.getData();
	        head = null;
	        return d;
	    }

	    
	    while (iter.getNext() != null) 
	    {
	    	iter = iter.getNext();
	    }

	    int d = iter.getData();
	    iter.getPrev().setNext(null); 
	    iter.setPrev(null);

	    return d;
	}
	
	public void InsertByPos(int d, int pos) 
	{
	    DintNode newNode = new DintNode(d);

	    if (pos <= 1 || head == null) 
	    {
	        
	        newNode.setNext(head);
	        
	        if (head != null)
	        {
	        	head.setPrev(newNode);
	        }
	            
	        head = newNode;
	        return;
	    }

	    DintNode iter = head;
	    int i;

	    for(i=1; i< pos && iter != null; i++)
	    {
	    	iter = iter.getNext();
	       
	    }

	    
	    newNode.setNext(iter.getNext());
	    newNode.setPrev(iter);

	    if (iter.getNext() != null)
	    {
	    	iter.getNext().setPrev(newNode);
	    }
	    	

	    iter.setNext(newNode);
	    
	    
	}
	
	public int DeleteAtPosition(int pos) 
	{
	    if (head == null) 
	    {
	        System.out.println("DLL is Empty...");
	        return -999;
	    }

	    if (pos <= 1) 
	    {
	        
	        return DeleteFirst();
	    }

	    DintNode iter = head;
	    int i;

	    for(i=1; i< pos && iter != null; i++)
	    {
	    	iter = iter.getNext();
	       
	    }

	    if (iter == null) 
	    {
	        System.out.println("Position out of range");
	        return -999;
	    }

	    int d = iter.getData();

	    if (iter.getPrev() != null)
	    {
	    	iter.getPrev().setNext(iter.getNext());
	    }

	    if (iter.getNext() != null)
	    {
	    	iter.getNext().setPrev(iter.getPrev());
	    }

	    
	    iter.setPrev(null);
	    iter.setNext(null);

	    
	    if (iter == head)
	    {
	    	head = iter.getNext();
	    }

	    return d;
	}


	
	public void Display()
	{
		if(head == null)
		{
			System.out.println("DLL is Empty...");
			return;
		}
		else
		{
			DintNode iter = head;
			
			while(iter != null)
			{
				System.out.print(iter.getData() + "  ");
				iter = iter.getNext();
			}
			return;
		}
	}
	
	

}
