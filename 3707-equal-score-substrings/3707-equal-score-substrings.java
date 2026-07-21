class Solution {
    public boolean scoreBalance(String s) {
      int n = s.length();
      int[] sum = new int[n+1];  
      
      for(int i = 1 ; i <= n ; i++){
        char a = s.charAt(i-1);
        int val = (a - 'a') + 1 ;
        sum[i] = sum[i-1] + val ;
      }
    for(int i : sum ){
        if(i == sum[n]/2 && sum[n]%2 == 0){
            return true ;
        }
    }
    return false ;
    }
}