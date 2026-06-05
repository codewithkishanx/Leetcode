class Solution {
    public int largestValsFromLabels(int[] values, int[] labels,
                                     int numWanted, int useLimit) {

        int n = values.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = values[i];
            arr[i][1] = labels[i];
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        HashMap<Integer, Integer> freq = new HashMap<>();
        int sum = 0;
        int taken = 0;

        for (int i = 0; i < n && taken < numWanted; i++) {

            int value = arr[i][0];
            int label = arr[i][1];

            if (freq.getOrDefault(label, 0) < useLimit) {
                sum += value;
                taken++;

                freq.put(label,
                        freq.getOrDefault(label, 0) + 1);
            }
        }

        return sum;
    }
}