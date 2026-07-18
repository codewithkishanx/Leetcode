class Solution {
    public int maxValidPairSum(int[] nums, int k) {
     int n  = nums.length;
     int[] prefixmax = new int[n];

     int max = nums[n-1];
     for(int i = n-1 ; i >= 0 ; i--){
        max= Math.max(max , nums[i]) ;
        prefixmax[i] = max ;
        
     }   
     int ans = 0 ;
     for(int i = 0 ; i < n - k ; i++){
        ans = Math.max(ans , nums[i] + prefixmax[i+k]);
     }
     return ans ;
    }
}