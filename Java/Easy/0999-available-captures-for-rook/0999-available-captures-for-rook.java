class Solution {
    public int numRookCaptures(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int newRow = 0;
        int newCol = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R') {
                    newRow = i;
                    newCol = j;
                }
            }

        }
        int count = 0;
        // Upper
        for (int i = newRow - 1; i >= 0; i--) {
            if (board[i][newCol] == 'p') {
                count++;
                break;
            } else if (board[i][newCol] == 'B') {
                break;
            }

        }
        // down
        for (int i = newRow + 1; i < m; i++) {
            if (board[i][newCol] == 'p') {
                count++;
                break;
            } else if (board[i][newCol] == 'B') {
                break;
            }
        }
        // left
        for (int i = newCol - 1; i >= 0; i--) {
            if (board[newRow][i] == 'p') {
                count++;
                break;
            } else if (board[newRow][i] == 'B') {
                break;
            }
        }
        // right
        for (int i = newCol + 1; i < n; i++) {
            if (board[newRow][i] == 'p') {
                count++;
                break;
            } else if (board[newRow][i] == 'B') {
                break;
            }
        }
        return count;

    }
}