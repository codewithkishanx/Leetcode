class Solution {
    public long[] getDistances(int[] arr) {
        int n = arr.length;
        long[] ans = new long[n];

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> list : map.values()) {

            long total = 0;
            for (int idx : list) {
                total += idx;
            }

            long prefix = 0;
            int m = list.size();

            for (int i = 0; i < m; i++) {
                long curr = list.get(i);

                long left = curr * i - prefix;

                long right = (total - prefix - curr)
                           - curr * (m - i - 1);

                ans[(int) curr] = left + right;

                prefix += curr;
            }
        }

        return ans;
    }
}