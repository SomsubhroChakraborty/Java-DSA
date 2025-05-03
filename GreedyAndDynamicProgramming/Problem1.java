// 1. Write programs to traverse a given graph using
// i) Depth First Search (DFS)
// ii) Breadth First Search (BFS)


package GreedyAndDynamicProgramming;
import java.util.*;

public class Problem1 {
    private int V;
    private LinkedList<Integer>[] adjList;

    //Constructor
    public Problem1(int v){
        V=v;
        adjList = new LinkedList[v];
        for(int i=0; i<v ; i++){
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
     
    }

    //Dfs Traversal
    void DFS(int v) {
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(v);

        while (!stack.isEmpty()) {
            v = stack.pop();

            if (!visited[v]) {
                System.out.print(v + " ");
                visited[v] = true;
            }

            // Get all adjacent vertices of the popped vertex v
            Iterator<Integer> it = adjList[v].iterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n])
                    stack.push(n);
            }
        }
}
void BFS(int s) {
    boolean visited[] = new boolean[V];
    LinkedList<Integer> queue = new LinkedList<>();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
        s = queue.poll();
        System.out.print(s + " ");

        Iterator<Integer> it = adjList[s].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                visited[n] = true;
                queue.add(n);
            }
        }
    }
}
public static void main(String args[]) {
    Problem1 g = new Problem1(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Depth First Traversal starting from vertex 2:");
// bredth First Traversal starting from vertex 2:");
    g.DFS(2);
    System.out.println("bredth First Traversal starting from vertex 2:");
    g.BFS(2);
}
}