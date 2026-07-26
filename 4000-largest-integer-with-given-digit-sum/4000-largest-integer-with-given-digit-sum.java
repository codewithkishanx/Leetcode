class Solution {
    public int largestInteger(int n, int s) {
     int i = 0 , num = 0;
     while( i < n){
      if(s>9){
        num = num*10 + 9 ;
        s -= 9 ;
      }else{
         num = num*10 + s ;
        s = 0 ;
      }
      i++;
     } 
     if(s>0){
        return -1 ;
     }  
     return num ;
    }
}