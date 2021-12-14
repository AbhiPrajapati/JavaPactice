package Graphs;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    private LinkedList<Integer> adj[];
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of vertex and Edges");
        int V = in.nextInt();
        int E = in.nextInt();

        Graph graph = new Graph(V);
        System.out.println("Enter the no of "+E+"Edges");
        for (int i = 0; i < E; i++) {
            int s = in.nextInt();
            int d = in.nextInt();
            graph.addEdge(s,d);
        }
    }
}
