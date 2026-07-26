class Solution {
    public int largestInteger(int n, int s) {
      if(s==0){
        return 0 ;
      }
      if(9*n <s){
        return -1 ;
      }

     
      int[] arr = new int[n];
      int i = 0 ;
      while(s>0 & i < n){
        if(s >9){
        arr[i++]  = 9 ;
        s -= 9 ;
        }else{
            arr[i++] = s ;
            s = 0 ;
        }
       
      }
      int num = 0 ;
      for(int k : arr){
        num = num*10 + k ;
      }
      return num ;
        
    }
}