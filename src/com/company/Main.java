package com.company;

public class Main {
    public static void main(String[] args)
    {
        GraphWithMap graph = new GraphWithMap(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();

        graph.searchEdge(2, 1);
        graph.searchEdge(0, 3);
    }
}