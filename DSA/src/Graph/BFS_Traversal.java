package Graph;
import Queue.*;
import java.util.Scanner;

public class BFS_Traversal {
	
	
	int adj[][];
	int n; 
	
	public BFS_Traversal(int i)
	{
		n = i;
		
		adj = new int[n][n];
	}
	public void create_graph()
	{
		int i,max_edges,origin,destin;

		Scanner sc=new Scanner(System.in);
		max_edges = n*(n-1);                  

		for(i=1; i<=max_edges; i++)
		{
			System.out.println("Enter edge (-1 -1) to quit : ");
			origin = sc.nextInt();
			destin = sc.nextInt();
			if((origin==-1) && (destin==-1))
				break;
			if(origin>=n || destin>=n || origin<0 || destin<0)
			{
				System.out.println("Invalid edge!\n");
				i--;
			}
			else
				adj[origin][destin] = 1;
		}
	}
	
	public void insert_edge(int origin,int destin)
	{
		if(origin<0 || origin>=n)
		{
			System.out.print("Origin vertex does not exist\n");
			return;
		}
		if(destin<0 || destin>=n)
		{
			System.out.print("Destination vertex does not exist\n");
			return;
		}
		adj[origin][destin] = 1;
	}
	
	public void del_edge(int origin, int destin)
	{
	     if(origin<0 || origin>=n || destin<0 || destin>=n || adj[origin][destin]==0)
	     {
			System.out.print("This edge does not exist\n");
			return;
	     }
	     adj[origin][destin] = 0;
	}
	
	
	public void display()
	{
		int i,j;
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
				System.out.print("   "+adj[i][j]);
			System.out.print("\n");
		}
	}
	
	public void BFS_Traversal(int v)
	{
		Scanner sc=new Scanner(System.in); 
		int i;
		int state[];
		state=new int[n];
		for(i=0; i<n; i++) 
			state[i] = 1;  //
		
		IntLineaeQueue q=new IntLineaeQueue(20);
		q.Insert(v);
		state[v] = 2;
		
		while(!q.isEmpty())
		{
			v = q.Remove( );
			System.out.print("  "+v);
			state[v] = 3;
			
			for(i=0; i<n; i++)
			{
				
				if(adj[v][i] == 1 && state[i] == 1) 
				{
					q.Insert(i);
					state[i] = 2;
				}
			}
		}
		System.out.print("\n");
		sc.close();
	}
}

