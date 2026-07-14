class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
       int count = 0;

        for (int i : nums1) {
            HashMap<Long, Integer> map = new HashMap<>();

            long sq = 1L * i * i;

            for (int j : nums2) {
                if (sq % j == 0) {
                    long need = sq / j;
                    count += map.getOrDefault(need, 0);
                }

                map.put((long) j, map.getOrDefault((long) j, 0) + 1);
            }
        }

        for (int i : nums2) {
            HashMap<Long, Integer> map = new HashMap<>();

            long sq = 1L * i * i;

            for (int j : nums1) {
                if (sq % j == 0) {
                    long need = sq / j;
                    count += map.getOrDefault(need, 0);
                }

                map.put((long) j, map.getOrDefault((long) j, 0) + 1);
            }
        }

        return count; 
    }
}