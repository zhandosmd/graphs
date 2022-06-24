package com.company;

import java.util.*;

class GraphWithLinkedList
{
    private int V; // # of vertices
    private LinkedList<Integer> adj[]; // adjacency Lists

    GraphWithLinkedList(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) {
        adj[v].add(w); // directed graph, so only one direction
    }

    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // A function used by DFS
    void DFSRecursive(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSRecursive(n, visited);
        }
    }

    void DFS(int v)
    {
        boolean visited[] = new boolean[V];
        DFSRecursive(v, visited);

        /* for disconnected graph
        for (int i = 0; i < V; ++i)
            if (visited[i] == false)
                DFSRecursive(i, visited);
        */
    }
}
