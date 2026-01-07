package Placement.Day26;
import java.util.*;
public class p4 { // Rotting oranges
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int time=0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            boolean rotted=false;
            for(int s=0;s<size;s++){
                int[] curr=q.poll();
                for(int d=0;d<4;d++){
                    int ni=curr[0]+dir[d][0];
                    int nj=curr[1]+dir[d][1];
                    if(ni>=0 && nj>=0 && ni<grid.length && nj<grid[0].length && grid[ni][nj]==1){
                        grid[ni][nj]=2;
                        fresh--;
                        q.add(new int[]{ni,nj});
                        rotted=true;
                    }
                }
            }
            if(rotted) time++;
        }
        return fresh==0 ? time : -1;
    }
    
}
