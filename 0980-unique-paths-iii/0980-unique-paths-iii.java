class Solution {
    public int uniquePathsIII(int[][] grid) {
        int empty = 0;
        int x=0;
        int y=0;
        int path[] = {0};
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==0){
                    empty++;
                }
                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        backtrack(grid, x, y, 0, empty+1, path);

        return path[0];
    }

    void backtrack(int grid[][], int i, int j, int count, int empty, int path[]){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==-1){
            return ;
        }
        if(grid[i][j]==2){
            if(count==empty){
                path[0]++;
            }
            return; 
        }
        int temp=grid[i][j];
        grid[i][j]=-1;

        backtrack(grid, i-1, j, count+1, empty, path);
        backtrack(grid, i+1, j, count+1, empty, path);
        backtrack(grid, i, j-1, count+1, empty, path);
        backtrack(grid, i, j+1, count+1, empty, path);

        grid[i][j]=temp;
    }
}