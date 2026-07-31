class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        int leftGap = arr[1] - arr[0];
        int rightGap = arr[2] - arr[1];

        int[] ans = new int[2];

        if (leftGap == 1 && rightGap == 1) {
            ans[0] = 0;
        } else if (leftGap <= 2 || rightGap <= 2) {
            ans[0] = 1;
        } else {
            ans[0] = 2;
        }

        ans[1] = arr[2] - arr[0] - 2;

        return ans;
    }
}