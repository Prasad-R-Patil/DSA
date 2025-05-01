package LinkedList;

public class IntNode {
	
	private int data;
	private IntNode next;
	
	
	public IntNode() 
	{
		data = 0;
		next = null;
	}
	
	public IntNode(int d) 
	{
		data = d;
		next = null;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	public int getData()
	{
		return data;
	}
	
	public void setNext(IntNode n)
	{
		next = n;
	}
	public IntNode getNext() 
	{
		return next;
	}
	
	
}
