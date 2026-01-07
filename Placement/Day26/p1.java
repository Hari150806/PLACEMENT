package Placement.Day26;
import java.util.*;
public class p1 { //topological sorting using dfs
     public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] indeg=new int[V];
        ArrayList<Integer> res = new ArrayList<>();
    
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            indeg[edges[i][1]]++;
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int temp =q.poll();
            res.add(temp);
            for(int i=0;i<adj.get(temp).size();i++){
                int child=adj.get(temp).get(i);
                indeg[child]--;
                if(indeg[child]==0){
                    q.add(child);
                }
                
            }
        }
        return res;
    }
    public static void main(String[] args) {
        p1 obj=new p1();
        int V=6;
        int[][] edges={{5,2},{5,0},{4,0},{4,1},{2,3},{3,1}};
        ArrayList<Integer> res=obj.topoSort(V, edges);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
    
    
}
