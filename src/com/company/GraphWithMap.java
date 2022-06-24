package com.company;

import java.util.*;

class GraphWithMap{

    HashMap<Integer, Set<Integer>> graph;
    private int v;

    public GraphWithMap(int vertices) {
        graph = new HashMap<>();
        v = vertices;
        for(int i = 0; i < v; i++)
        {
            graph.put(i, new TreeSet<>());
        }
    }

    public void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    public void printGraph() {
        for(int i = 0; i < v; i++)
        {
            System.out.println("Adjacency list of vertex " + i);
            Iterator set = graph.get(i).iterator();

            while (set.hasNext())
                System.out.print(set.next() + " ");

            System.out.println();
            System.out.println();
        }
    }

    public void searchEdge(int src, int dest) {
        Iterator set = graph.get(src).iterator();

        if (graph.get(src).contains(dest))
            System.out.println("Edge from " + src + " to " +
                    dest + " found");
        else
            System.out.println("Edge from " + src + " to " +
                    dest + " not found");

        System.out.println();
    }
}

