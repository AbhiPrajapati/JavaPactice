package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
    private static int vertex;
    private static LinkedList<Integer> adj[];
    public Graph (int v)
    {
        adj = new LinkedList[v];
        for(int i  =0 ; i < v ; i++)
        {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int dest)
    {
        adj[source].add(dest);
        adj[dest].add(source);
    }

    public static void bfs(int src)
    {
        boolean vis[] = new boolean[vertex];
        Queue queue = new LinkedList<Integer>();
        vis[src] = true;
        queue.add(src);

        while (!queue.isEmpty())
        {
            src = (int) queue.poll();
            System.out.println(src);

            for (int child: adj[src]) {
                if(!vis[child])
                {
                    vis[child] = true;
                    queue.add(child);
                }
            }
        }
    }

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of vertex and Edges");
        int V = in.nextInt();
        int E = in.nextInt();
        vertex = V;
        Graph graph = new Graph(V);
        System.out.println("Enter the no of "+E+"Edges");
        for (int i = 0; i < E; i++) {
            int s = in.nextInt();
            int d = in.nextInt();
            graph.addEdge(s,d);
        }
        System.out.println("Enter the source point");
        int source = in.nextInt();
        bfs(source);
    }
}
