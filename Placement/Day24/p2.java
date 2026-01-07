package Placement.Day24;
import java.util.*;
public class p2 { // Number of island in grid 
    public void dfs(char[][] grid,int[] start,boolean[][] vist){
        int i=start[0];
        int j=start[1];
        vist[i][j]=true;
        int[][] child= {{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k =0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length && j<grid[0].length && i>=0 &&j>=0 &&!vist[i][j]&& grid[i][j]=='1'){
                dfs(grid,new int[]{i,j},vist);
            }
        }
    }
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        boolean[][] vist=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vist[i][j] && grid[i][j]=='1'){
                    dfs(grid,new int[]{i,j},vist);
                    count++;
                }
            }
        }
        return count;
    }
    
}
