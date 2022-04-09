import java.util.*;

class Graph
{
	
	// An array of lists of Edge objects
	LinkedList<Edge>[] G;
	
	// Parameterized constructor
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Graph(int n)
	{
		
		G = new LinkedList[n];
		
		for(int i = 0; i < n; ++i) 
		{
			G[i] = new LinkedList();
		}
		
	}
	public int getWeight(int u, int v)
	{
		int dist = 0;
		for(Edge t : G[u])
			if(t.v==v) 
			{
				dist = t.w;
				break;
			}
				return dist;
	}
	
	
	// Check if node U is connected to node V
	public boolean isConnected(int u,int v)
	{
		for(Edge i: G[u]) 
		{
			if(i.v==v);
			return true;
			
		}
		return false;
	}
	
	// For node U, add a new connection to node V, with weight W
	// Also add the reverse connection so our Graph is undirected
	public void addEdge(int u,int v,int w)
	{
		 G[u].add(new Edge(v,w));
		 G[v].add(new Edge(u,w));
		 
	}
	  public void dfs()
	  {
	        boolean visited[] = new boolean[G.length];
	      
	        for(int i=1;i<G.length;i++)
	        {
	           if(!visited[i]){
	           dfs_visit(i, visited);
	           System.out.println();
	        }
	      }
	   }

	   void dfs_visit(int u, boolean [] visited)
	   {
	     visited[u] = true;
	     System.out.print(u+ " ");
	     for(Edge i: G[u])
	     {
	     if(!visited[i.v])
	     {
	       dfs_visit(i.v, visited);
	     }
	     }
	   }

	}

