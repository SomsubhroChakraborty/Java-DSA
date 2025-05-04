package GreedyAndDynamicProgramming;

import java.util.*;

public class Problem2 {
    static int[] parent;
	static int find(int a) {
		if (parent[a]!=a) {
            parent[a]=find(parent[a]);
        }
        return parent[a];
	}
	static void union(int a,int b) {
		int x=find(a);
		int y=find(b);
		if(x!=y) {
			parent[y]=x;
		}
	}
	public static int krushkal(int [][] edges,int ver) {
		int cost=0;
        int e=0;
		Arrays.sort(edges,Comparator.comparingInt(a->a[2]));
		parent=new int[ver];
        for (int i=0; i<ver;i++)
        	parent[i]=i;
        for (int[] edge : edges) {
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            if (find(u)!=find(v)) {
                union(u,v);
                cost+=w;
                e++;
                if (e==ver-1) break; // MST complete
            }
        }
        return cost;
	}
	
	
	public static int prim(int[][] graph, int V) {
            int cost=0;
	        int[] key=new int[V];
	        int[] parent=new int[V];
	        boolean[] visited=new boolean[V];
	        Arrays.fill(key,Integer.MAX_VALUE);
	        parent[0]=-1;
	        key[0]=0;
	        for (int i=0;i<V-1;i++) {
	            // Find the vertex with the minimum key not yet included
	            int u=minKey(key,visited,V);
	            visited[u]=true;
	            // Update the keys of adjacent vertices
	            for (int v=0;v<V;v++) {
	                if (graph[u][v]!=0 && !visited[v] && graph[u][v]<key[v]) {
	                    parent[v]=u;
	                    key[v]=graph[u][v];
	                }
	            }
	        }
	        for (int i=1;i<V;i++) {
	            cost+=graph[i][parent[i]];
	        }
	        return cost;
	    }

	    public static int minKey(int[] key,boolean[] visited,int V) {
	        int min=Integer.MAX_VALUE;
	        int index=-1;
	        for(int v=0;v<V;v++) {
	            if(!visited[v] && key[v]<min) {
	                min=key[v];
	                index=v;
	            }
	        }
	        return index;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = {
	            {0, 1, 10}, {1, 3, 15}, {2, 3, 4}, {2, 0, 6}, {0, 3, 5}
	        };
	    System.out.println(krushkal(edges,4));
	    int[][] graph = {
		         {0, 2, 0, 6, 0},
		         {2, 0, 3, 8, 5},
		         {0, 3, 0, 0, 7},
		         {6, 8, 0, 0, 9},
		         {0, 5, 7, 9, 0}
		     };

		int V=graph.length;
		System.out.println(prim(graph, V));
	}

}
