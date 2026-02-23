class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    if(backtrack(i, j, board, word, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean backtrack(int i, int j, char board[][], String word, int id){
        int m=board.length;
        int n = board[0].length;
        if(id==word.length()){
            return true;
        }
        if(i<0 || i>=m || j<0 || j>=n || board[i][j]=='$'){
            return false;
        }
        if(board[i][j]!=word.charAt(id)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='$';
        
        boolean found = backtrack(i-1, j, board, word, id+1) || backtrack(i+1, j, board, word, id+1) || backtrack(i, j-1, board, word, id+1) || backtrack(i, j+1, board, word, id+1);

        board[i][j]=temp;

        return found;
    }
}