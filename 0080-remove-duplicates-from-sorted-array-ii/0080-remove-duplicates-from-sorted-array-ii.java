class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int prev = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == prev) {
                count++;
            } else {
                prev = nums[i];
                count = 1;
            }

            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }
}