class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;

        int[] maxVal = new int[n];
        int[] maxIdx = new int[n];
        int[] minVal = new int[n];
        int[] minIdx = new int[n];

        maxVal[n - 1] = minVal[n - 1] = nums[n - 1];
        maxIdx[n - 1] = minIdx[n - 1] = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= maxVal[i + 1]) {
                maxVal[i] = nums[i];
                maxIdx[i] = i;
            } else {
                maxVal[i] = maxVal[i + 1];
                maxIdx[i] = maxIdx[i + 1];
            }

            if (nums[i] <= minVal[i + 1]) {
                minVal[i] = nums[i];
                minIdx[i] = i;
            } else {
                minVal[i] = minVal[i + 1];
                minIdx[i] = minIdx[i + 1];
            }
        }

        for (int i = 0; i + indexDifference < n; i++) {
            int j = i + indexDifference;

            if (Math.abs(nums[i] - maxVal[j]) >= valueDifference) {
                return new int[]{i, maxIdx[j]};
            }

            if (Math.abs(nums[i] - minVal[j]) >= valueDifference) {
                return new int[]{i, minIdx[j]};
            }
        }

        return new int[]{-1, -1};
    }
}