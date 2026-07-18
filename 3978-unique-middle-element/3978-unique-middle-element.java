class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int  n = nums.length ;
        int mid = nums[n/2];
        int count = 0 ;
        for(int i : nums){
           
            if(mid == i){
                count++ ;
            }
             if(count>1)return false ;
        }
        return true ;
    }
}