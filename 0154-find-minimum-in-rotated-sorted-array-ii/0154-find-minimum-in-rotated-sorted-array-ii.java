class Solution {
    public int findMin(int[] nums) {
       int min = 5001 ;
       for(int a: nums){
        min = Math.min(min ,a);
       } 
       return min ;
    }
}