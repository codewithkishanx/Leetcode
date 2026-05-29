class Solution {
    public int maxWidthRamp(int[] nums) {
       Stack<Integer> s = new Stack<>(); 
       s.push(0);
       for(int i = 1 ; i < nums.length ; i++){
           if(nums[s.peek()] > nums[i]){
            s.push(i);
           }
       } 
       int j = nums.length -1 ;
       int ans = 0 ;
       while(!s.isEmpty()){
         if(nums[s.peek()]<= nums[j]){
            ans = Math.max(ans ,j- s.peek());
            s.pop();
            
         }else{
            j--;
         }
       }
       return ans ;
    }
}