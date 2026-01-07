package Placement.Day25;

import java.util.ArrayList;

public class p3 { // Graph is tree or not
     public boolean detectcycleDfs(ArrayList<ArrayList<Integer>> adj,
                                  boolean[] vist,
                                  int node,
                                  int parent) {

        vist[node] = true;

        for (int child : adj.get(node)) {
            if (!vist[child]) {
                if (detectcycleDfs(adj, vist, child, node)) {
                    return true;
                }
            } else if (child != parent) {
                return true;
            }
        }
        return false;
    }
    public boolean isTree(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vist = new boolean[V];
        if (detectcycleDfs(adj, vist, 0, -1)) {
            return false;
        }
        for (boolean b : vist) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
}
