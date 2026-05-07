class Solution {
    public boolean canJump(int[] nums) {
       if(nums[0]==0 && nums.length != 1)return false;
       int n = nums[0] ;
       for(int i = 1 ; i < nums.length-1 ;i++){
           n--;
           n = Math.max(n , nums[i]);
           if(n==0){
            return false;
           }
       }
       return true ;
    }
}