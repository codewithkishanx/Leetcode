class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] hor = new boolean[9][10];
        boolean[][] ver = new boolean[9][10];
        boolean[][] box = new boolean[9][10];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                int val = board[i][j] - '0';

                if (hor[i][val]) {
                    return false;
                }
                hor[i][val] = true;

  
                if (ver[j][val]) {
                    return false;
                }
                ver[j][val] = true;


                int boxIndex = (i / 3) * 3 + (j / 3);

                if (box[boxIndex][val]) {
                    return false;
                }
                box[boxIndex][val] = true;
            }
        }

        return true;
    }
}