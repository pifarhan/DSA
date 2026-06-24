class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        Nqueens(board, 0, ans);

        return ans;
    }

    private void Nqueens(char[][] board, int row,
                         List<List<String>> ans) {

        if(row == board.length) {

            List<String> temp = new ArrayList<>();

            for(int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for(int col = 0; col < board.length; col++) {

            if(isSafe(board, row, col)) {

                board[row][col] = 'Q';

                Nqueens(board, row + 1, ans);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board,
                           int row,
                           int col) {

        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col - 1;
            i >= 0 && j >= 0;
            i--, j--) {

            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1;
            i >= 0 && j < board.length;
            i--, j++) {

            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}