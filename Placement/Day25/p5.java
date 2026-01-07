package Placement.Day25;

import java.util.LinkedList;
import java.util.Queue;

public class p5 { //number of enclaves 
    int numberOfEnclaves(int[][] grid) {
        int n= grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] vist=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||i==n-1||j==0||j==m-1){
                    if(grid[i][j]==1){
                        q.add(new int []{i,j});
                        vist[i][j]=true;
                    }
                }
            }
        }
        while(!q.isEmpty()){
            int i=q.peek()[0];
            int j=q.peek()[1];
            q.poll();
            int[][] child = {{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
            for(int k=0;k<4;k++){
                int ci=child[k][0];
                int cj=child[k][1];
                if(ci>=0 && ci<n && cj>=0 && cj<m && !vist[ci][cj] && grid[ci][cj]==1){
                    vist[ci][cj]=true;
                    q.add(new int[]{ci,cj});
                }
                
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vist[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        p5 obj=new p5();
        int[][] grid={{0,0,0,0},
                      {1,0,1,0},
                      {0,1,1,0},
                      {0,0,0,0}};
        System.out.println(obj.numberOfEnclaves(grid));
        
    }
}
