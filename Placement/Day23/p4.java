package Placement.Day23;
import java.util.*;
public class p4 { // No.of .operation to make network connected
    static class DisjointSet {
        int[] parent;
        int[] rank;

        DisjointSet(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int find(int u) {
            if (parent[u] != u) {
                parent[u] = find(parent[u]);
            }
            return parent[u];
        }

        void union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);
            if (rootU != rootV) {
                if (rank[rootU] < rank[rootV]) {
                    parent[rootU] = rootV;
                } else if (rank[rootU] > rank[rootV]) {
                    parent[rootV] = rootU;
                } else {
                    parent[rootV] = rootU;
                    rank[rootU]++;
                }
            }
        }
    }

    public static int makeConnected(int n, int[][] connections) {
        DisjointSet ds = new DisjointSet(n);
        int extraEdges = 0;

        for (int[] conn : connections) {
            int u = conn[0];
            int v = conn[1];
            if (ds.find(u) == ds.find(v)) {
                extraEdges++;
            } else {
                ds.union(u, v);
            }
        }

        int components = 0;
        for (int i = 0; i < n; i++) {
            if (ds.find(i) == i) {
                components++;
            }
        }

        int requiredEdges = components - 1;
        return extraEdges >= requiredEdges ? requiredEdges : -1;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] connections = { { 0, 1 }, { 0, 2 }, { 1, 2 } };

        int result = makeConnected(n, connections);
        System.out.println("Minimum operations to connect the network: " + result);
    }
    
}
