class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int i = 0, ans = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            while (count[c] > 0) {
                count[s.charAt(i)]--;
                i++;
            }

            count[c]++;
            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}