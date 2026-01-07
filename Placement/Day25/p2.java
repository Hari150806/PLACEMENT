package Placement.Day25;

public class p2 { // count no of complete components in graph
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

        boolean isCompleteComponent(boolean[] visited, int start) {
            visited[start] = true;
            for (int i = 0; i < V; i++) {
                if (adjMatrix[start][i] == 1) {
                    if (!visited[i]) {
                        if (!isCompleteComponent(visited, i)) {
                            return false;
                        }
                    }
                }
            }
            for (int i = 0; i < V; i++) {
                if (i != start && !visited[i] && adjMatrix[start][i] == 0) {
                    return false;
                }
            }
            return true;
        }

        int countCompleteComponents() {
            boolean[] visited = new boolean[V];
            int count = 0;
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (isCompleteComponent(visited, i)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(3, 4);

        System.out.println("Number of complete components: " + g.countCompleteComponents());
    }
    
}
