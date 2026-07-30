class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length ;
       int[] ans = new int[n];
       int val = 0 ;
       for(int i = 0 ;i < n ; i++){
        val+= nums[i];
        ans[i] = val ;

       } 
       return ans ;
    }
}