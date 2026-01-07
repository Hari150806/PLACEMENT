package Placement.Day22;

import java.util.LinkedList;   // 🔥 missing import – idhu dhaan main fix

public class p1 { // graph implementation using adjacency list

    static class Graph {
        int V;
        LinkedList<Integer>[] adj;

        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u); // For undirected graph
        }

        void printGraph() {
            for (int i = 0; i < V; i++) {
                System.out.print("Vertex " + i + ":");
                for (Integer neighbor : adj[i]) {
                    System.out.print(" -> " + neighbor);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
