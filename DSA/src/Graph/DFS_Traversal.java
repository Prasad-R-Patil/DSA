package Graph;

import java.util.Scanner;

import Stack.IntStack;

public class DFS_Traversal {
	
	
	int adj[][];
	int n; 
	int state[];
	public DFS_Traversal(int d)
	{
        n = d;
		adj = new int[n][n];
		state = new int[n];
		for(int i=0;i<n;i++)
			state[i]=0;
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
		System.out.print(" ");
		for(i=0; i<n; i++)
		   System.out.print("   "+i);
		System.out.println();
		for(i=0; i<n; i++)
		{
			System.out.print(i);
			for(j=0; j<n; j++)
				System.out.print("   "+adj[i][j]);
			System.out.print("\n");
		}
	}
	
	public void DF_Traversal(int v)
	{
		IntStack st = new IntStack(50);
		int i;
		st.push(v);
		while(!st.isEmpty())
		{
			v = st.pop();
			if(state[v]==0)
			{
				System.out.print("  "+v);
				state[v]=1;
			}
			for(i=n-1; i>=0; i--)
			{
				if(adj[v][i]==1 && state[i]==0)
					st.push(i);
			}
		}
	}

}
