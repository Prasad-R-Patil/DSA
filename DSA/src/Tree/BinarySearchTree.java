package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	private TreeNode root;

	public BinarySearchTree() 
	{
		root = null;
	}
	
	public BinarySearchTree(TreeNode r) 
	{
		root = r;
	}

	public TreeNode getRoot() 
	{
		return root;
	}

	public void setRoot(TreeNode root) 
	{
		this.root = root;
	}
	
	
	public void Insert_NonRecursive(int d)
	{
		
		TreeNode new_node = new TreeNode(d);
		
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		TreeNode iter = root;
		
		while(true)
		{
			if(d<iter.getData())
			{
				if(iter.getLeft() == null)
				{
					iter.setLeft(new_node);
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
					iter.setRight(new_node);
					return;
				}
				else
				{
					iter = iter.getRight();
				}
		
			}
			
			else
			{
				System.out.println("Duplicate Value Can not be inserted...");
				return;
			}
		}
		
	}
	
	public void Insert_Using_Parent(int d)
	{
		
		TreeNode new_node = new TreeNode(d);
		
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		TreeNode iter = root;
		TreeNode Parent;
		
		while(iter != null)
		{
			Parent = iter;
			
			if(d<iter.getData())
			{
				iter = iter.getLeft();
			}
			
			else if(d>iter.getData())
			{
				iter = iter.getRight();
			}
			
			else
			{
				System.out.println("Duplicate Value Can not be inserted...");
				return;
			}
			
			if(d<Parent.getData())
			{
				Parent.setLeft(new_node);
				return;
			}
			else
			{
				Parent.setRight(new_node);
				return;
			}
			
		}
		
		
	}
	
	
	public void Insert_Using_Recursion(int d)
	{
		root = Insert_recv(root,d);
	}
	
	private TreeNode Insert_recv(TreeNode r , int d)
	{
		if(r==null)
		{
			return new TreeNode(d);
		}
		
		if(d<r.getData())
		{
			r.setLeft(Insert_recv(r.getLeft(),d));
		}
		
		else if(d>r.getData())
		{
			r.setRight(Insert_recv(r.getRight(),d));
		}
		else
		{
			System.out.println("Duplicate Value Can not be inserted...");
		}
		
		return r;
	}
	
	public TreeNode SearchNode(int key)
	{
		return SearchNodeR(root,key);
		
	}
	
	private TreeNode SearchNodeR(TreeNode r , int key)
	{
		if(r == null) 
		{
			return null;
		}
		if(key < r.getData())
		{
			return SearchNodeR(r.getLeft(),key);
		}
		else if(key > r.getData())
		{
			return SearchNodeR(r.getRight(),key);
		}
		else
		{
			return r;
		}
	}
	
	public void DeleteNode(int d)
	{
		root = deleteNodeR(root,d);
	}
	
	private TreeNode deleteNodeR(TreeNode r , int d)
	{
		TreeNode succ;
		
		if(r == null)
		{
			System.out.println("Empty BinarySearchTree...");
		}
		
		if(d < r.getData())
		{
			r.setLeft(deleteNodeR(r.getLeft(),d));
		}
		else if(d > r.getData())
		{
			r.setRight(deleteNodeR(r.getRight(),d));
		}
		else
		{
			if( (r.getLeft() != null) && (r.getRight() != null) )
			{
				succ = r.getRight();
				
				while(succ.getLeft() != null)
				{
					succ = succ.getLeft();
				}
				r.setData(succ.getData());
				
				r.setRight(deleteNodeR(r.getRight(),succ.getData()));
			}
			else
			{
				if(r.getLeft() != null)
				{
					r = r.getLeft();
				}
				else if(r.getRight() != null)
				{
					r = r.getRight();
				}
				else
				{
					r = null;
				}
			}
			
			
		}
		
		return r;
		
	}
	
	
	
	
	public void Display()
	{
		if(root == null)
		{
			System.out.println("Root Node is Null...");
			return;
		}
		
		TreeNode iter;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		q.add(root);
		
		while(! q.isEmpty())
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
