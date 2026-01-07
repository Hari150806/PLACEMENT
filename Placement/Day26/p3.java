package Placement.Day26;
import java.util.*;  
public class p3 { // dijistra's algorithm
    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<int[]>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});
            adj.get(edges[i][1]).add(new int[]{edges[i][0],edges[i][2]});
        }
        int[] dist= new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,src});
        while(!pq.isEmpty()){
            int disttillnow = pq.peek()[0];
            int node = pq.poll()[1];
            for(int i=0;i<adj.get(node).size();i++){
                int child = adj.get(node).get(i)[0];
                int edgeweight= adj.get(node).get(i)[1];
                int sourceTochilddist=edgeweight+disttillnow;
                if(dist[child]>sourceTochilddist){
                    dist[child]=sourceTochilddist;
                    pq.add(new int[]{sourceTochilddist,child});
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        p3 obj=new p3();
        int V=5;
        int[][] edges={{0,1,2},{0,2,4},{1,2,1},{1,3,7},{2,4,3},{3,4,1}};
        int src=0;
        int[] res=obj.dijkstra(V, edges, src);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    
}
