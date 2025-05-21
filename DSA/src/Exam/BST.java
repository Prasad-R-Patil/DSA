package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
	
	public int HightRec()
	{
		return hightBSTrec(root);
	}
	
	public int hightBSTrec(TN r)
	{
		if(r == null)
		{
			return 0;
		}
		
		int leftH = hightBSTrec(r.getLeft());
		int rightH = hightBSTrec(r.getRight());
		
		return (leftH>=rightH)?leftH+1 : rightH+1;
		
	}
	
	
	int max;
	int min;
	public void MaxMin()
	{
		if(root == null)
		{
			System.out.println("Tree is Empty");
			return ;
		}
		
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		max=root.getData();
		min=root.getData();
		
		while(!q.isEmpty())
		{
			TN iter = q.remove();
			
			if(iter.getData() < min)
			{
				min = iter.getData();
			}
			if(iter.getData() > max)
			{
				max = iter.getData();
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
		
		System.out.println(min +" -> is Minimum");
		System.out.println(max +" -> is Maximum");
	}
	
	public void SumAvgCountOfNode()
	{
		if(root == null)
		{
			System.out.println("Tree is Empty");
			return ;
		}
		
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		
		int sum=0;
		int cnt=0;
		
		while(!q.isEmpty())
		{
			TN iter = q.remove();
			
			sum = sum+iter.getData();
			cnt = cnt+1;
			
			if(iter.getLeft() != null)
			{
				q.add(iter.getLeft());
			}
			if(iter.getRight() != null)
			{
				q.add(iter.getRight());
			}
		}
		
		System.out.println(sum +" -> is Sum of All Node");
		System.out.println(cnt +" -> is Count of All Node");
		System.out.println(sum/cnt +" -> is Avg of All Node");
		
	}
	
	public void SumOfLeaf_NonLeaf()
	{
		if(root == null)
		{
			System.out.println("Tree is Empty");
			return ;
		}
		
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		
		int sumLeaf=0;
		int sumNonLeaf=0;
	
		
		while(!q.isEmpty())
		{
			TN iter = q.remove();
			
			if(iter.getLeft() == null && iter.getRight() == null)
			{
				sumLeaf = sumLeaf + iter.getData();
			}
			if((iter.getLeft() != null) || (iter.getRight() != null))
			{
				sumNonLeaf = sumNonLeaf + iter.getData();
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
		
		
		System.out.println(sumLeaf +" -> is sumLeaf of Node");
		System.out.println(sumNonLeaf +" -> is sumNonLeaf of  Node");
		
	}
	
	
	public boolean FindSubTree(TN mainTree, TN subTree) 
	{
	    if (mainTree == null || subTree == null) 
	    {
	        return false;
	    }

	    Stack<TN> stack = new Stack<>();
	    stack.push(mainTree);

	    while (!stack.isEmpty()) {
	        TN node = stack.pop();

	        if (node.getData() == subTree.getData()) 
	        {
	            if (isIdentical(node, subTree)) 
	            {
	                return true;
	            }
	        }

	        if (node.getRight() != null) stack.push(node.getRight());
	        if (node.getLeft() != null) stack.push(node.getLeft());
	    }

	    return false;
	}

	
	public boolean isIdentical(TN root1, TN root2) 
	{
        Stack<TN> stack = new Stack<>();
        stack.push(root1);
        stack.push(root2);

        while (!stack.isEmpty()) {
            
            
            TN n2 = stack.pop();
            TN n1 = stack.pop();

            if (n1 == null && n2 == null) 
            {
            	continue;
            }
            if (n1 == null || n2 == null) 
            {
            	return false;
            }
            if (n1.getData() != n2.getData()) 
            {
            	return false;
            }

            stack.push(n1.getLeft());
            stack.push(n2.getLeft());
            stack.push(n1.getRight());
            stack.push(n2.getRight());
        }
        return true;
    }
	
	

}
