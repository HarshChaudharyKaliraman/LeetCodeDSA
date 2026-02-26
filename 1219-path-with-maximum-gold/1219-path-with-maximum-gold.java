class Solution {
    int max=0;
    public int getMaximumGold(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]!=0){
                    max=Math.max(max, dfs(i, j, grid));
                }
            }
        }
        return max;
    }

    int dfs(int i, int j, int grid[][]){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        int gold = grid[i][j];
        grid[i][j]=0;
        int u = dfs(i-1, j, grid);
        int d = dfs(i+1, j, grid);
        int l = dfs(i, j-1, grid);
        int r = dfs(i, j+1, grid);

        grid[i][j] = gold;
        return gold + Math.max(Math.max(u, d), Math.max(l, r));
    }
}