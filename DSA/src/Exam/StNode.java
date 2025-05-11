package Exam;

public class StNode {
	
	private Student data;
	private StNode next;
	
	
	public StNode() 
	{
		data = null;
		next = null;
	}
	
	public StNode(Student d) 
	{
		data = d;
		next = null;
	}
	
	public void setData(Student d)
	{
		data = d;
	}
	public Student getData()
	{
		return data;
	}
	
	public void setNext(StNode n)
	{
		next = n;
	}
	public StNode getNext() 
	{
		return next;
	}
	
	
	
}
