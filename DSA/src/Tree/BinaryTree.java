package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	private TreeNode root;
	
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
		
		System.out.println(root.getData());
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
		System.out.println(root.getData());
		visit_InOrder(root.getRight());
		return;
	}
	
	public void PostOrder()  // wrappper Function
	{
		visit_InOrder(root);
	}
	
	
	private void visit_PostOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		visit_PostOrder(root.getLeft());
		visit_PostOrder(root.getRight());
		System.out.println(root.getData());
		
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
			
			System.out.println(iter.getData());
			
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
