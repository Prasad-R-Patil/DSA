package Queue;

public class IntCircularQueue {
	
	private int arr[];
	private int front;
	private int rear;
	
		public IntCircularQueue()
		{
			arr = new int [10];
			//front = rear = -1;
			
			front = -1;
			rear = -1;
		}
		
		public IntCircularQueue(int s)
		{
			arr = new int [s];
			//front = rear = -1;
			
			front = -1;
			rear = -1;
		}
	
	
		
		public boolean isFull()
		{
			if( ( ( front == 0 ) && ( rear == arr.length -1 ) ) || ( ( front - rear ) == 1 ) )
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
			if(front == -1)
			{
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
			if(front == -1)
			{
				front = 0;
			}
			if(rear == arr.length -1 )
			{
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
			
			int d = arr[front];
			
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			
			else if(front == arr.length -1)
			{
				front = 0;
				
			}
			else
			{
				front++;
			}
			
			return d;
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
	
		public void Display() {
		    if (isEmpty()) {
		        System.out.println("Queue is Empty: Nothing to display...");
		        return;
		    }

		    System.out.print("Queue Elements: ");

		    if (rear >= front)
		    {
//				 linear Queue madhe asel tar print honar
		    	
		        for (int i = front; i <= rear; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        
//		        System.out.println();
//		        System.out.println("[1]------------------------------");
		    } 
		    else 
		    {
		       
//				 Circular Queue madhe asel tar print honar
		        
		        for (int i = 0; i <= rear; i++) 
		        {
		            System.out.print(arr[i] + " ");
		        }
//		        System.out.println();
//		        System.out.println("[2]------------------------------");
		        
		        for (int i = front; i < arr.length; i++) 
		        {
		            System.out.print(arr[i] + " ");
		        }
//		        System.out.println();
//		        System.out.println("[3]------------------------------");
		    }

		    System.out.println();
		}
	
	
	
	

}
