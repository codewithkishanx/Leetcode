class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        boolean[] seen1 = new boolean[10];
        boolean[] seen2 = new boolean[10];

        int min1 = 10;
        int min2 = 10;

        for (int num : nums1) {
            seen1[num] = true;

            min1 = num < min1 ? num : min1;
        }

        for (int num : nums2) {
            seen2[num] = true;

            min2 = num < min2 ? num : min2;
        }

        for (int digit = 1; digit < 10; digit++) {
            if (seen1[digit] && seen2[digit]) {
                return digit;
            }
        }

        return min1 < min2 ? min1 * 10 + min2 : min2 * 10 + min1;
    }
}