class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i< board.length; i++)
        {
            for(int j = 0 ; j < board.length; j++)
            {
                if(board[i][j] == '.')
                {
                    continue;
                }
                else{
                    String row = board[i][j] + "in row" + i;
                    String column = board[i][j] + "in column" + j;
                    String box = board[i][j] + "in box" + i/3 + j/3;
                    if(set.add(row) && set.add(column) && set.add(box)){
                        continue;
                    }
                    return false;

                }
            }
        }
        return true;
    }
}
