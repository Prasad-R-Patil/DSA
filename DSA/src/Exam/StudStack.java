package Exam;

public class StudStack {
	
	private Student stud[];
	private int top;
	
	public StudStack()
	{
		stud = new Student[10];
		top= -1;
	}
	public StudStack(int s)
	{
		stud = new Student[s];
		top= -1;
	}
	
	public void push(Student s)
	{
		if(top == stud.length-1)
		{
			System.out.println("Stack OverFlow...");
			return;
		}
		
		top++;
		stud[top]=s;
		return;
	}
	
	public  void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack UnderFlow");
			return ;
		}
		
		System.out.println(stud[top]);
		top--;
		return;
		
		
	}
	
	public Student  peek()
	{
		if(top == -1)
		{
			System.out.println("Stack UnderFlow");
			return null;
		}
		
		
		return stud[top];
		
		
	}
	
	public void Display()
	{
		for(int i=top; i>=0; i--)
		{
			System.out.println(stud[i]);
		}
	}

}
