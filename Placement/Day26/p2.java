package Placement.Day26;
import java.util.*;
public class p2 { //kahn's algorithm for topological sort
    

    static class Graph {
        int V;
        ArrayList<ArrayList<Integer>> adj;

        Graph(int v) {
            V = v;
            adj = new ArrayList<>();
            for (int i = 0; i < v; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v); // For directed graph
        }

        List<Integer> topologicalSort() {
            int[] inDegree = new int[V];
            for (int i = 0; i < V; i++) {
                for (int neighbor : adj.get(i)) {
                    inDegree[neighbor]++;
                }
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < V; i++) {
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }

            List<Integer> topoOrder = new ArrayList<>();
            while (!queue.isEmpty()) {
                int node = queue.poll();
                topoOrder.add(node);

                for (int neighbor : adj.get(node)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) {
                        queue.add(neighbor);
                    }
                }
            }

            if (topoOrder.size() != V) {
                throw new IllegalStateException("Graph has at least one cycle, topological sort not possible");
            }

            return topoOrder;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        List<Integer> topoOrder = g.topologicalSort();
        System.out.println("Topological Sort: " + topoOrder);
    }
    
}
