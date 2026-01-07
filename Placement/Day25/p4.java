package Placement.Day25;

public class p4 { // island perimeter
     public int dfs(int[][] grid,int[] start,boolean[][] vist){
        int i=start[0];
        int j=start[1];
        vist[i][j]=true;
        int perimeter=4;
        int[][] child= {{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k =0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length && j<grid[0].length && i>=0 &&j>=0 && grid[i][j]==1){
                perimeter--;
            }
        }
        int m=0;
        for(int k =0;k<4;k++){
            i=child[k][0];
            j=child[k][1];
            if(i<grid.length && j<grid[0].length && i>=0 &&j>=0 &&!vist[i][j]&& grid[i][j]==1){
                m+=dfs(grid,new int[]{i,j},vist);
            }
        }
        return m+perimeter; 
    }
    public int islandPerimeter(int[][] grid) {
        boolean[][] vist=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vist[i][j] && grid[i][j]==1){
                    return dfs(grid,new int[]{i,j},vist);
                }
            }
        }
        return 0;
    }
    
}
