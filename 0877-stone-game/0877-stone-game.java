class Solution {
    int[][] dp ;
    public boolean stoneGame(int[] piles) {
        int n = piles.length ;
         dp = new int[n][n];
       int total = 0 ;
       for(int i :piles){
        total += i ;
       } 
       int alice = max(piles ,0 , piles.length -1) ;
       return (total - alice)< alice ;


    }
    public int  max(int[] x ,int start , int end){
        if(start > end){
            return 0 ;
        }
        if(start == end){
            return x[start] ;
        }
        if(dp[start][end] != 0){
            return dp[start][end] ;
        }
        int f = x[start] + Math.min(max(x,start+2 ,end),max(x , start +1 ,end -1));
        int e = x[end] + Math.min(max(x,start+1 ,end-1),max(x , start  ,end -2));
        return dp[start][end] = Math.max(f,e);

    } 
}