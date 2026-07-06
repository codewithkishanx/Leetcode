class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] dig = new int[n];


        for (int i = 0; i < n; i++) {
            int max = 0, temp = nums[i];

            while (temp > 0) {
                int digit = temp % 10;
                max = Math.max(max, digit);
                temp /= 10;
            }

            dig[i] = max;
        }

        for (int i = 0; i < n; i++) {
            int min = 9, temp = nums[i];

            while (temp > 0) {
                int digit = temp % 10;
                min = Math.min(min, digit);
                temp /= 10;
            }

            dig[i] -= min;
        }

        int val = 0;
        for (int x : dig) {
            val = Math.max(val, x);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (dig[i] == val) {
                ans += nums[i];
            }
        }

        return ans;
    }
}