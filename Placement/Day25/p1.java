package Placement.Day25;

public class p1 { // check complete graph or not
    static class Graph {
        int V;
        int E;

        Graph(int v, int e) {
            V = v;
            E = e;
        }

        boolean isComplete() {
            return E == V * (V - 1) / 2;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5, 10); // Example: 5 vertices and 10 edges

        if (g.isComplete()) {
            System.out.println("The graph is complete.");
        } else {
            System.out.println("The graph is not complete.");
        }
    }
    
}
