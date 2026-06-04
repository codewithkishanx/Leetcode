class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] pre_sum = new int[nums.length];
        pre_sum[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            pre_sum[i] = nums[i] + pre_sum[i-1];
        }
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0 ; i < nums.length ;i++){
            if(!map.containsKey(pre_sum[i]%k)){
              map.put(pre_sum[i]%k , i);
            }
            else{
                if(i - map.get(pre_sum[i]%k) >= 2){
                    return true ;
                }
            }
        }
        return false ;
    }
}