class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] gain = new int[n];

        for (int i = 0; i < n; i++) {
            int factorI = items[i][0];
            int free = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % factorI == 0) {
                    free++;
                }
            }

            gain[i] = 1 + free;
        }

        int[] dp = new int[budget + 1];

        for (int i = 0; i < n; i++) {
            int cost = items[i][1];

            for (int b = budget; b >= cost; b--) {
                dp[b] = Math.max(dp[b], dp[b - cost] + gain[i]);
            }

            for (int b = cost; b <= budget; b++) {
                dp[b] = Math.max(dp[b], dp[b - cost] + 1);
            }
        }

        return dp[budget];
    }
}