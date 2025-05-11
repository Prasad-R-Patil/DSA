package Exam;

public class StudQueue {
	
	private Student stud[];
	private int front,rear;
	
	public StudQueue()
	{
		stud = new Student[10];
		front = rear = -1;
	}
	
	public void add(Student s)
	{
		if(rear == stud.length-1)
		{
			System.out.println("queue is Overflow");
			return;
		}
		if(rear == -1)
		{
			rear++;
			front++;
			stud[rear]=s;
			return;
		}
		
		rear++;
		stud[rear]=s;
	}
	
	public Student remove()
	{
		if((front == -1) && (rear- front == 1))
		{
			System.out.println("empty");
			return null;
		}
		
		else
		{
			Student d = stud[front];
			front++;
			return d;
		}
		
		
	}
	
	public Student peek()
	{
		if((front == -1) && (rear- front == 1))
		{
			System.out.println("empty");
			return null;
		}
		
		else
		{
			return stud[front];
		}
		
		
	}

	
	
	
	
	
	public void Display()
	{
		for(int i=front; i<=rear; i++)
		{
			System.out.println(stud[i]);
		}
	}
	
	
	
	
}
