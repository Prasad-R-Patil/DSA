package LinkedList;

public class SingleLinkedList {
	
	private IntNode head;
	
	public SingleLinkedList()
	{
		head=null;
	}
	
	
	
	
		public IntNode getHead() 
		{
		    return head;
		}

	     public void setHead(IntNode head) 
	     {
	    	 this.head = head;
	     }




		public void InsertFirst(int d)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head=new_node;
				return;
			}
			else
			{
				new_node.setNext(head);
				head = new_node;
				return;
			}
			
		}
		
		public void InsertLast(int d)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
				return;
			}
			
			IntNode iter = head;
			
			while( iter.getNext() != null)
			{
				iter = iter.getNext();
			}
			
			iter.setNext(new_node);
			return;
		}
		
		public int DeleteFirst()
		{
			int d = -999;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty....");
				return d;
			}
			else
			{
				d = head.getData();
				head = head.getNext();
				return d;
			}
		}
		
		public int DeleteLast()
		{
			int d = -999;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty....");
				return d;
			}
			
			if(head.getNext() == null)
			{
				d = head.getData();
				head = null;
				return d;
			}
			
			IntNode iter = head;
			
			while(iter.getNext().getNext() != null)
			{
				iter = iter.getNext();
			}
			
				d = iter.getNext().getData();
				IntNode  deletable = iter.getNext();
				
				iter.setNext(null);
				deletable = null;
				return d;
			
		}
		
		public void Insert_By_Pos(int d, int pos)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
				return;
			}
			if(pos == 1)
			{
				new_node.setNext(head);
				head = new_node;
				return;
			}
			
			IntNode iter = head;
			int i;
			for(i = 1; i < ( pos-1 ) && (iter.getNext() != null); i++ )
			{
				iter = iter.getNext();
			}
			
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			
			return;
			
			
		}
		
		public int Delete_By_Pos(int pos)
		{
			int d= -999;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty...");
				return d;
			}
			if(pos == 1)
			{
				d=head.getData();
				
				head = head.getNext();
				return d;
			}
			
			IntNode iter = head;
			int i;
			
			for(i=1; i < (pos -1) && (iter.getNext() != null); i++)
			{
				iter = iter.getNext();
			}
			
			if(iter.getNext() != null)
			{
				d = iter.getNext().getData();
				iter.setNext(iter.getNext().getNext());
			}
			return d;
			
		}
		
		public void Insert_Before_Data(int d, int key)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
				return;
			}
			if(head.getData()==key)
			{
				new_node.setNext(head);
				head = new_node;
				return;
			}
			
			IntNode iter = head;
			
			while( (iter.getNext() != null) && (iter.getNext().getData() != key) )
			{
				iter = iter.getNext();
			}
			
			if(iter.getNext() == null)
			{
				System.out.println("Invalid key... Insertion Not Possible...");
				return;
			}
			else
			{
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);
				return;
			}
			
			
		}
		
		public void Insert_After_Data(int d, int key)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
				return;
			}
			
			IntNode iter = head;
			
			while((iter != null) && (iter.getData() != key))
			{
				iter = iter.getNext();
				
			}
			
			if(iter == null)
			{
				System.out.println("Invalid key... Insertion Not Possible...");
				return;
			}
			else
			{
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);
				return;
			}
		}
		
		public int Delete_Before_Data(int key)
		{
			int d = -999;
			if(head == null)
			{
				System.out.println("Single Linked List is Empty...");
				return d;
			}
			if(head.getData() == key)
			{
				System.out.println("Sorry... Not Any Node Before Key to delete...");
				return d;
			}
			if(head.getNext().getData() == key)
			{
				d = head.getData();
				head = head.getNext();
				return d;
			}
			
			IntNode iter =  head;
			
			while((iter != null ) && (iter.getNext().getNext().getData() != key))
			{
				iter = iter.getNext();
			}
			
			if(iter.getNext() == null)
			{
				System.out.println("Invalid key... Deletion Not Possible...");
				return d;
			}
			else
			{
				d= iter.getNext().getData();
				iter.setNext(iter.getNext().getNext());
				
			}
			
			return d;
		}
	
		public int Delete_After_Data(int key)
		{
			int d = -999;
			
			if(head == null)
			{
				System.out.println("Single Linked List is Empty...");
				return d;
			}
			if(head.getNext() == null)
			{
				System.out.println("Sorry... Not Any Node After Key to delete...");
				return d;
			}
			
			IntNode iter = head;
			
			while( (iter != null) && (iter.getData() != key))
			{
				iter = iter.getNext();
			}
			
			if(iter.getNext() == null)
			{
				System.out.println("Sorry... Not Any Node After Key to delete...");
				return d;
			}
			else
			{
				d = iter.getNext().getData();
				iter.setNext(iter.getNext().getNext());
				
			}
			
			return d;
		}
		
		public int Count_Node()
		{
			int cnt = 0;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty....");
				return cnt;
			}
			else
			{
				IntNode iter = head;
				
				while (iter != null)
				{
					cnt++;
					iter = iter.getNext();
				}
				
			}
			
			return cnt;
		}
		
		public void Sorted_Inserted(int d) 
		{
		    IntNode new_node = new IntNode(d);

		  
		    if (head == null || d < head.getData()) {
		        new_node.setNext(head);
		        head = new_node;
		        return;
		    }

		    IntNode iter = head;
		    while (iter.getNext() != null && iter.getNext().getData() < d) {
		        iter = iter.getNext();
		    }
		    
		    new_node.setNext(iter.getNext());
		    iter.setNext(new_node);
		    
		}

		
		public void Display()
		{
			
			
			IntNode iter = head;
			int i;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty...");
			}
			
			System.out.print("Single-Linked-List => ");
			while(iter!= null)
			{
				System.out.print(iter.getData() + " :-> ");
				
				iter = iter.getNext();
			}
		}
	
	
	
		
		
		
		
		/* ===================================[Linked List Concat ]=================================== */
	
		
		public SingleLinkedList Concat_LinkedList(SingleLinkedList sll2)
		{
			SingleLinkedList res = new SingleLinkedList();
			
			IntNode iter = head;
			
			while(iter != null)
			{
				res.InsertLast(iter.getData());
				iter=iter.getNext();
			}
			
			
			iter=sll2.getHead();
			
			
			while(iter != null)
			{
				res.InsertLast(iter.getData());
				iter=iter.getNext();
			}
		
			return res;
		}
	
		
		public void Reverse()
		{
			IntNode prev = null;
			IntNode curr = head;
			IntNode next ;
			
			
			
			while(curr != null)
			{
				next = curr.getNext();
				curr.setNext(prev);
				prev=curr;
				curr=next;
			}
			
			head = prev;
	
			
		}
		
		public void Even_Odd()
		{
			
		}
	
	

		
		
}
