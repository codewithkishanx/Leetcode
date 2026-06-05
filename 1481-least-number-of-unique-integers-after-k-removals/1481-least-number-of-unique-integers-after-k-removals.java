class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] freq = new int[map.size()];
        int idx = 0;

        for (int f : map.values()) {
            freq[idx++] = f;
        }

        Arrays.sort(freq);

        int unique = freq.length;

        for (int f : freq) {
            if (k >= f) {
                k -= f;
                unique--;
            } else {
                break;
            }
        }

        return unique;
    }
}