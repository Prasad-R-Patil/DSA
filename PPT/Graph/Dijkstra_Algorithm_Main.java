package for_DSA;

import java.util.Scanner;

class Graph_for_Dijkstra{
	int adj[][];
	int n; 
	int status[];      // 0 for Temp   1  for Perm
	int predecessor[];	/*predecessor of each vertex in shortest path*/ 
	int pathLength[]; 
	public Graph_for_Dijkstra(int d)
	{
        n = d;
		adj = new int[n][n];
		status = new int[n];
		predecessor = new int[n];
		pathLength = new int[n];
		for(int i=0;i<n;i++)
			status[i]=0;
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
	}/*End of insert_edge()*/
	public void Dijkstra(int s)
	{
		int i, current;
		/* Make all vertices temporary */
		for(i=0; i<n; i++)
		{
			predecessor[i] =  -1;   
			pathLength[i] = 9999;
			status[i] = 0;
		}
		/* Make pathLength of source vertex equal to 0 */
		pathLength[s] = 0;
		while(true)
		{
			/*Search for temporary vertex with minimum pathLength 
			and make it current vertex*/
			current = min_temp( );
		
			if( current == -1 )
				return;
			
			status[current] = 1;

			for(i=0; i<n; i++)
			{
				/*Checks for adjacent temporary vertices */
				if ( adj[current][i] !=0 && status[i] == 0 )
					if( pathLength[current] + adj[current][i] < pathLength[i] )
					{	
						predecessor[i] = current;  /*Relabel*/
						pathLength[i] = pathLength[current] + adj[current][i];    
					}
			}
		}
	}
		
		/*Returns the temporary vertex with minimum value of pathLength
		  Returns NIL if no temporary vertex left or 
		  all temporary vertices left have pathLength infinity*/
	public int min_temp()
	{
			int i;
			int min = 9999;
			int k = -1;  
			for(i=0;i<n;i++)
			{
				if(status[i] == 0 && pathLength[i] < min)
				{
					min = pathLength[i];
					k = i;
				}
			}
			return k;
	}/*End of min_temp( )*/
	void findPath(int s, int v )
	{
		int i,u;
		int path[]=new int[50];		/*stores the shortest path*/
		int shortdist = 0;	/*length of shortest path*/ 
		int count = 0;		/*number of vertices in the shortest path*/
		
		/*Store the full path in the array path*/
		while( v != s )
		{
			count++;
			path[count] = v;
			u = predecessor[v];
			shortdist += adj[u][v];
			v = u;	
		}
		count++;
		path[count]=s;

		System.out.println("Shortest Path is : ");
		for(i=count; i>=1; i--)	
			System.out.print("  "+path[i]);
		System.out.print("\n Shortest distance is : "+ shortdist);
	}/*End of findPath()*/ 
	
		
	}


public class Dijkstra_Algorithm_Main {

	public static void main(String[] args) {
		Graph_for_Dijkstra gd = new Graph_for_Dijkstra(8);
		int pathLength[]=new int[50];
		int s,v;
		gd.adj[0][1] = 8;
		gd.adj[0][2] = 2;
		gd.adj[0][3] = 7;
		gd.adj[1][5] = 16;
		gd.adj[2][0] = 5;
		gd.adj[2][3] = 4;
		gd.adj[2][6] = 3;
		gd.adj[3][4] = 9;
		gd.adj[4][0] = 4;
		gd.adj[4][5] = 5;
		gd.adj[4][7] = 8;
		gd.adj[6][2] = 6;
		gd.adj[6][3] = 3;
		gd.adj[6][4] = 4;	
		gd.adj[7][5] = 2;
		gd.adj[7][6] = 5;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter source vertex(-1 to quit): ");
		s = sc.nextInt();
		
		gd.Dijkstra(s);

		while(true)
		{
			System.out.print("Enter destination vertex(-1 to quit): ");
			v = sc.nextInt();
			//if(s > v) break;
			if(v == -1)
				break;
			if(v < 0 || v >= gd.n )
				System.out.print("This vertex does not exist\n");
			else if(v == s)
				System.out.print("Source and destination vertices are same\n");
			else if( pathLength[v] == 9999 )
				System.out.print("There is no path from source to destination vertex\n");
			else
				gd.findPath(s,v);
		}

	}

}
