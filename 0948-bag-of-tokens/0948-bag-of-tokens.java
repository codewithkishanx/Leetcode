class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
          int n = tokens.length ;
          if(n == 0){
            return 0 ;
          }
        Arrays.sort(tokens);
        int score = 0 ;
        int left = 0 , right = n-1 ;
        while(left <= right){
            if(power >= tokens[left]){
                power -= tokens[left] ;
                score++ ;
                left++ ;
            }
            else if(score > 0 && left < right ){
                score-- ;
                power += tokens[right] ;
                right-- ;

            }
            else {
                return score ;
            }
        }
        return score ;
    }
}