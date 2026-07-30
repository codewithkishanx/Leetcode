class Solution {
    public int minimumPushes(String word) {
       int count = 0 , step = 1 , map = 0;
       for(char a : word.toCharArray()){
         if(map == 8){
                step++ ;
                map = 0 ;
            }
             count += step ;
            map++ ;
       }
       
       
        
        return count ;
    }
}