package Placement.Day24;
import java.util.*;
public class p1 { // Find path if exists in graph
    static class Graph {
        int V;
        int[][] adjMatrix;

        Graph(int v) {
            V = v;
            adjMatrix = new int[v][v];
        }

        void addEdge(int u, int v) {
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // For undirected graph
        }

        boolean isPathExists(int src, int dest) {
            boolean[] visited = new boolean[V];
            return isPathExistsUtil(src, dest, visited);
        }

        boolean isPathExistsUtil(int src, int dest, boolean[] visited) {
            if (src == dest) {
                return true;
            }
            visited[src] = true;

            for (int i = 0; i < V; i++) {
                if (adjMatrix[src][i] == 1 && !visited[i]) {
                    if (isPathExistsUtil(i, dest, visited)) {
                        return true;
                    }
                }
            }
            return false;
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

        System.out.println("Is path exists from vertex 0 to vertex 3: " + g.isPathExists(0, 3));
    }

}