package Exam;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	private TN root;
	
	
	public BST()
	{
		root = null;
	}
	public BST(TN r)
	{
		root = r;
	}
	
	public TN getRoot() 
	{
		return root;
	}
	public void setRoot(TN root) 
	{
		this.root = root;
	}
	
	
	
	
	public void Insert(int d)
	{
		TN node = new TN(d);
		
		if(root == null)
		{
			root = node;
			return;
		}
		
		TN iter = root;
		
		while(true)
		{
			if(d<iter.getData())
			{
				if(iter.getLeft() == null)
				{
					iter.setLeft(node);
					return;
				}
				else
				{
					iter = iter.getLeft();
				}
			}
			
			else if(d>iter.getData())
			{
				if(iter.getRight() == null)
				{
					iter.setRight(node);
					return;
				}
				else
				{
					iter = iter.getRight();
				}
			}
			else
			{
				System.out.println("Duplicate not allow...");
				return;
			}
		}
		
	}
	
	public void InsertRec(int d)
	{
		root = InsertRecv(root,d);
	}
	
	private TN InsertRecv(TN r, int d)
	{
		
		if(r == null)
		{
			return new TN(d);
		}
		
		if(d < r.getData())
		{
			r.setLeft(InsertRecv(r.getLeft(),d));
		}
		else if(d > r.getData())
		{
			r.setRight(InsertRecv(r.getRight(),d));
		}
		else
		{
			System.out.println("Duplicate not allow");
			return null;
		}
		
		return r;
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
	

}
