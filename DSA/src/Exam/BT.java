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
		
		TN temp;
		TN curr;
		Queue<TN> q = new LinkedList<TN>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			curr = q.remove();
			
			temp = curr.getLeft();
			curr.setLeft(curr.getRight());
			curr.setRight(temp);
			
			if(curr.getLeft() != null)
			{
				q.add(curr.getLeft());
			}
			if(curr.getRight() != null)
			{
				q.add(curr.getRight());
			}
		}
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
	
	
	
	
}
