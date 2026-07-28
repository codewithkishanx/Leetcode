class Solution {
    public int missingNumber(int[] nums) {
     int[] ans = new int[nums.length +1];
     Arrays.fill(ans , -1);
     for(int i : nums){
        ans[i] = 0 ;
     }   
     for(int i = 0 ; i < ans.length ;i++){
        if(ans[i]  == -1){
           return i ;
        }
     }
     return -1 ;
    }
}