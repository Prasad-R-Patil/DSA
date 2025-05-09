package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	private TreeNode root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public BinaryTree(TreeNode r)
	{
		root = r;
	}
	
	public void setRoot(TreeNode r)
	{
		root = r;
	}
	
	public TreeNode getRoot()
	{
		return root;
	}
	
	public TreeNode createNode(int d)
	{
		return new TreeNode(d);
		
		// OR
		
		/*
		 * TreeNode new_node = new TreeNode(d);
		 *  return new_node;
		 */
		
	}
	
	
// ******************************************************************************************************************* //
	
	
	public void PreOrder()  // wrappper Function
	{
		visit_PreOrder(root);
	}
	
	
	private void visit_PreOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.getData() +" ");
		visit_PreOrder(root.getLeft());
		visit_PreOrder(root.getRight());
		return;
	}
	
	public void InOrder()  // wrappper Function
	{
		visit_InOrder(root);
	}
	
	
	private void visit_InOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		visit_InOrder(root.getLeft());
		System.out.print(root.getData()+" ");
		visit_InOrder(root.getRight());
		return;
	}
	
	public void PostOrder()  // wrappper Function
	{
		visit_PostOrder(root);
	}
	
	
	private void visit_PostOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		visit_PostOrder(root.getLeft());
		visit_PostOrder(root.getRight());
		System.out.print(root.getData() +" ");
		
		return;
	}
	
// ******************************************************************************************************************* //
	
	
	public void Insert_LevelWise(int d)
	{
		TreeNode new_node = new TreeNode(d);
		
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		TreeNode iter;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		q.add(root);
		
		while(true)
		{
			iter = q.remove();
			
			if(iter.getLeft() == null)
			{
				iter.setLeft(new_node);
				return;
			}
			else
			{
				q.add(iter.getLeft());
			}
			
			if(iter.getRight() == null)
			{
				iter.setRight(new_node);
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
	
	
	public int Find_Height()
	{
		if(root == null)
		{
			return 0;
		}
		
		TreeNode iter;
		
		TreeNode d = new TreeNode(-999);
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		int cnt = 0;
		
		q.add(root);
		q.add(d);
		
		while(! q.isEmpty())
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
	
	
	public boolean isIdentical(BinaryTree bt1, BinaryTree bt2)
	{
		TreeNode iter1;
		TreeNode iter2;
		
		if(bt1.getRoot() == null || bt2.getRoot() == null)
		{
			return false;
		}
		
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		
		q1.add(bt1.getRoot());
		q2.add(bt2.getRoot());
		
		while( (!q1.isEmpty()) && (!q2.isEmpty()) )
		{
			iter1 = q1.remove();
			iter2 = q2.remove();
			
			if(iter1.getData() != iter2.getData())
			{
				return false;
			}
			
			if(iter1.getLeft() != null)
			{
				q1.add(iter1.getLeft());
			}
			if(iter1.getRight() != null)
			{
				q1.add(iter1.getRight());
			}
			
			if(iter2.getLeft() != null)
			{
				q2.add(iter2.getLeft());
			}
			if(iter2.getRight() != null)
			{
				q2.add(iter2.getRight());
			}
		}
		
		if((q1.isEmpty()) && (q2.isEmpty()))
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
		
	}
	
	
	public void mirrorImage() 
	{
	    if (root == null) 
	    {
	        return;
	    }

	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(root);

	    while (!q.isEmpty()) 
	    {
	        TreeNode curr = q.remove();

	        //  left ->  <- right
	        // right ->  <- left
	        
	        TreeNode temp = curr.getLeft();
	        
	        curr.setLeft(curr.getRight());
	        
	        curr.setRight(temp);

	        if (curr.getLeft() != null) 
	        {
	            q.add(curr.getLeft());
	        }

	        if (curr.getRight() != null) 
	        {
	            q.add(curr.getRight());
	        }
	    }
	}

	public void mirrorRec() {
	    root = mirrorRec(root);
	}

	private TreeNode mirrorRec(TreeNode r) {
	    if (r == null) {
	        return null;
	    }

	    
	    TreeNode left = mirrorRec(r.getLeft());
	    TreeNode right = mirrorRec(r.getRight());

	    r.setLeft(right);
	    r.setRight(left);

	    return r;
	}

	
	
	
	

}
