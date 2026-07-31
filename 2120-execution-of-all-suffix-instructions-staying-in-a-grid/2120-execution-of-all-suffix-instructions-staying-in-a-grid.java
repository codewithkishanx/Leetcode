class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length();
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {

            int row = startPos[0];
            int col = startPos[1];
            int count = 0;

            for (int j = i; j < m; j++) {

                char c = s.charAt(j);

                if (c == 'R') col++;
                else if (c == 'L') col--;
                else if (c == 'U') row--;
                else row++;

                if (row < 0 || row >= n || col < 0 || col >= n) {
                    break;
                }

                count++;
            }

            ans[i] = count;
        }

        return ans;
    }
}