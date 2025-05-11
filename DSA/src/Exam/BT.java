package Exam;

import java.util.LinkedList;
import java.util.Queue;

public class BT {
	
	private TN root;
	
	public BT()
	{
		root=null;
	}
	
	public BT(TN d)
	{
		
		root=d;
	}

	public TN getRoot() {
		return root;
	}

	public void setRoot(TN root) {
		this.root = root;
	}
	
	
	
	public void insertLVL(int d)
	{
		TN node = new TN(d);
		
		if(root == null)
		{
			root = node;
			return;
		}
		
		TN iter;
		
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		
		while(true)
		{
			iter = q.remove();
			
			if(iter.getLeft() == null)
			{
				iter.setLeft(node);
				return;
			}
			else
			{
				q.add(iter.getLeft());
			}
			
			if(iter.getRight() == null)
			{
				iter.setRight(node);
				return;
			}
			else
			{
				q.add(iter.getRight());
			}
		}
	}
	
	public void Display()
	{
		if(root == null)
		{
			System.out.println("Tree Empty");
			return;
		}
		
		TN iter;
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			iter = q.remove();
			
			System.out.print(iter.getData() + " ");
			
			if(iter.getLeft() != null)
			{
				q.add(iter.getLeft());
			}
			if(iter.getRight() != null)
			{
				q.add(iter.getRight());
			}
		}
	}
	
	//**************************************************************************************************************
	
	
	public void PreOreder() //wrapper function
	{
		Visit_Pre(root);
	}
	
	private void Visit_Pre(TN r)
	{
		
		if(r == null)
		{
			return;
		}
		
		System.out.print(r.getData()+" ");
		Visit_Pre(r.getLeft());
		Visit_Pre(r.getRight());
		
		return;
		
	}
	
	public void InOrder() // Wrapper function
	{
		Visit_In(root);
	}
	
	private void Visit_In(TN r)
	{
		if(r == null)
		{
			return;
		}
		
		Visit_In(r.getLeft());
		System.out.print(r.getData()+" ");
		Visit_In(r.getRight());
	}
	
	public void PostOrder() // Wrapper function
	{
		Visit_Post(root);
	}
	
	private void Visit_Post(TN r)
	{
		if(r == null)
		{
			return;
		}
		
		Visit_Post(r.getLeft());
		Visit_Post(r.getRight());
		System.out.print(r.getData()+" ");
	}
	
	//*************************************************************************************************
	
	public int hight()
	{
		int cnt = 0;
		
		if(root == null)
		{
			return 0;
		}
		
		TN iter;
		TN d = new TN(-999);
		
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		q.add(d);
		
		
		while(!q.isEmpty())
		{
			iter = q.remove();
			
			if(iter.getData() == -999)
			{
				cnt++;
				q.add(d);
				
				iter = q.remove();
			}
			
			if(iter.getLeft() != null)
			{
				q.add(iter.getLeft());
			}
			if(iter.getRight() != null)
			{
				q.add(iter.getRight());
			}
		}
		return cnt;
	}
	
	
	
	public void MirrorImg()
	{
		if(root == null)
		{
			System.out.println("Can Not Create MirrorImg");
			System.out.println("Root is Null");
			return;
		}
		
		TN iter;
		TN temp;
		TN curr;
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			iter = q.remove();
			
			temp = iter.getLeft();
			iter.setLeft(iter.getRight());
			iter.setRight(temp);
			
			if(iter.getLeft() != null)
			{
				q.add(iter.getLeft());
			}
			if(iter.getRight() != null)
			{
				q.add(iter.getRight());
			}
		}
	}
	
}
