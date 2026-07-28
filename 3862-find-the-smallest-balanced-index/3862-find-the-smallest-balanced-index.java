class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;

        final long LIMIT = 100000000000000L;

        long[] leftSum = new long[n];
        long[] rightProd = new long[n];

        leftSum[0] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        rightProd[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (rightProd[i + 1] > LIMIT / nums[i + 1]) {
                rightProd[i] = LIMIT + 1;
            } else {
                rightProd[i] = rightProd[i + 1] * nums[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightProd[i]) {
                return i;
            }
        }

        return -1;
    }
}