package DoublyLinkedList;

public class DintNode {
		
	private int data;
	private DintNode prev;
	private DintNode next;
	
	public DintNode(int d)
	{
		data = d;
	}

	public int getData() 
	{
		return data;
	}

	public void setData(int data) 
	{
		this.data = data;
	}

	public DintNode getPrev() 
	{
		return prev;
	}

	public void setPrev(DintNode prev) 
	{
		this.prev = prev;
	}

	public DintNode getNext() 
	{
		return next;
	}

	public void setNext(DintNode next) 
	{
		this.next = next;
	}
	
	
	
	
	
	
}
