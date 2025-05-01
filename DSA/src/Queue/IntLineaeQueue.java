package Queue;


// Iterger Linear Queue.......


public class IntLineaeQueue {
	
	private int arr[];
	private int front;
	private int rear;
	
	public IntLineaeQueue()
	{
		arr = new int[10];
		
		//front = rear = -1;
		
		front = -1;
		rear = -1;
	}
	
	public IntLineaeQueue(int s)
	{
		arr = new int[s];
		
		//front = rear = -1;
		
		front = -1;
		rear = -1;
	}
	
	
	public boolean isFull()
	{
		if(rear == arr.length -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if((front == -1) || ((front - rear)== 1) )
		{
			front = -1;
			rear = -1;
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public void Insert(int d)
	{
		if(isFull())
		{
			System.out.println("Queue is OverFlow...");
			return;
		}
		else if(front == -1)
		{
			front = 0;
			rear = 0;
			
		}
		else
		{
			rear++;
	
		}
		
		arr[rear] = d;
		
	}
	
	
	public int Remove()
	{
		if(isEmpty())
		{
			System.out.println("Queue is UnderFlow...");
			return -999;
		}
		
		else
		{
			int d = arr[front];
			
			front++;
			return d;
		}
			
			
		
		
	}
	
	public int Peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is UnderFlow...");
			return -999;
		}
		else
		{
			return arr[front];
		}
		
	}
	
	public void Display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty : Noting to Display...");
		}
		else
		{
			for(int i = front; i<=rear; i++)
			{
				System.out.print(arr[i] + " <= ");
			}
			
		}
		System.out.println();
	}
	
	
	

}
