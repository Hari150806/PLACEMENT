package Placement.Day24;
import java.util.*;
public class p3 { // floor fill
    public void dfs(int[][] grid,int[] start,int prevColor,int newColor,boolean[][] vist){
        int i=start[0];
        int j=start[1];
        vist[i][j]=true;
        grid[i][j]=newColor;
        int[][] child= {{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k =0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length && j<grid[0].length && i>=0 &&j>=0 &&!vist[i][j]&& grid[i][j]==prevColor){
                dfs(grid,new int[]{i,j},prevColor,newColor,vist);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int prevColor=image[sr][sc];
        if(prevColor==newColor) return image;
        boolean[][] vist=new boolean[image.length][image[0].length];
        dfs(image,new int[]{sr,sc},prevColor,newColor,vist);
        return image;
    }
    
}
