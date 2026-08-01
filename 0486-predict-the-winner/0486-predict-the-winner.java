class Solution {
    int[][] dp;

    public boolean predictTheWinner(int[] nums) {
        if (nums.length <= 2) return true;

        int sum = 0;
        int n = nums.length;

        for (int x : nums) {
            sum += x;
        }

        dp = new int[n][n];

        int score = maxScore(0, n - 1, nums);

        return score >= (sum - score);
    }

    public int maxScore(int i, int j, int[] nums) {
        if (i > j) {
            return 0;
        }

        if (i == j) {
            return nums[i];
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int start = nums[i] + Math.min(
                maxScore(i + 2, j, nums),
                maxScore(i + 1, j - 1, nums)
        );

        int end = nums[j] + Math.min(
                maxScore(i + 1, j - 1, nums),
                maxScore(i, j - 2, nums)
        );

        return dp[i][j] = Math.max(start, end);
    }
}