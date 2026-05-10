class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int res[]=new int[n+n];
        for(int i=0;i<n;i++){
            res[i]=nums[i];
            res[n+n-i-1]=nums[i];
        }
        return res;
    }
}