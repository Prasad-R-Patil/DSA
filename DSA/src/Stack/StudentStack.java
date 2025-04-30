package Stack;

public class StudentStack {
	
		
		private Student arr[];
		private int top;
		
		
		public StudentStack()
		{
			arr = new Student[10];
			top = -1;
		}
		
		public StudentStack(int s)
		{
			arr = new Student[s];
			top = -1;
		}
		
		
		public void push(Student d)
		{
			if(top == arr.length-1)
			{
				System.out.println("Stack OverFlow...");
				return;
			}
			else
			{
				top++;
				
				arr[top]=d;
				return;
			}
		}
		
		public Student pop()
		{
			Student d = new Student();
			
			if(top == -1)
			{
				System.out.println("Stack UnderFlow...");
				return d;
			}
			else
			{
				d = arr[top];
				top--;
				return d;
			}
		}
		
		public Student peek()
		{
			Student d = new Student();
			
			if(top == -1)
			{
				System.out.println("Stack UnderFlow...");
				return d;
			}
			
			else
			{
				return arr[top];
			}
			
		}
		
		
		public boolean isFull()
		{
			if(top == arr.length -1)
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
			if(top == -1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public void Display()
		{
			if(top == -1)
			{
				System.out.println("Stack is Empty...");
				
			}
			
			{
				for (int i=top; i>=0; i--)
				{
					System.out.println(arr[i]);
				}
			}
			
		}
		
		

	


}
