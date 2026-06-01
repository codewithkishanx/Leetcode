class Solution {
    public int minimumCost(int[] cost) {
      int len = cost.length -1 ;
      int ans  = 0 ;
      Arrays.sort(cost);
      int i = 0 ;
      while(i<= len){
       ans +=  cost[len--];
        
        
        if(len >= i){
            ans  += cost[len--];
             
        }
         if(len >= i){
            len-- ;
            
        }
       
      }
      return ans ;
    }
}