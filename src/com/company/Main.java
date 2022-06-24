package com.company;

public class Main {
    public static void main(String[] args)
    {
        /* Example of implementing by HashMap & Set*/
        GraphWithMap graphWithMap = new GraphWithMap(5);

        graphWithMap.addEdge(0, 1);
        graphWithMap.addEdge(0, 4);
        graphWithMap.addEdge(1, 2);
        graphWithMap.addEdge(1, 3);
        graphWithMap.addEdge(1, 4);
        graphWithMap.addEdge(2, 3);
        graphWithMap.addEdge(3, 4);
        graphWithMap.printGraph();
        graphWithMap.searchEdge(2, 1);
        graphWithMap.searchEdge(0, 3);

        /* Example of implementing by LinkedList, BFS, DFS */
        GraphWithLinkedList graphWithLinkedList = new GraphWithLinkedList(4);

        graphWithLinkedList.addEdge(0, 1);
        graphWithLinkedList.addEdge(0, 2);
        graphWithLinkedList.addEdge(1, 2);
        graphWithLinkedList.addEdge(2, 0);
        graphWithLinkedList.addEdge(2, 3);
        graphWithLinkedList.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2)");
        graphWithLinkedList.BFS(2);
        System.out.println("Depth First Traversal (starting from vertex 2)");
        graphWithLinkedList.DFS(2);

        /* Example of Dijkstra */
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        DijkstraExample t = new DijkstraExample();
        t.dijkstra(graph, 0);
    }
}