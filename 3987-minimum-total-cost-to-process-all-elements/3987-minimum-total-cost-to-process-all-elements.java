class Solution {
    public int minimumCost(int[] nums, int k) {
        long resource = k;
        long operations = 0;
        long ans = 0;
        long MOD = 1_000_000_007L;
        long INV2 = 500000004L; // inverse of 2 modulo MOD

        for (int x : nums) {
            if (resource < x) {

                long need = (x - resource + k - 1L) / k;

                long first = operations + 1;
                long last = operations + need;

                long sum = ((first % MOD + last % MOD) % MOD);
                sum = (sum * (need % MOD)) % MOD;
                sum = (sum * INV2) % MOD;

                ans = (ans + sum) % MOD;

                operations += need;
                resource += need * (long) k;
            }

            resource -= x;
        }

        return (int) ans;
    }
}