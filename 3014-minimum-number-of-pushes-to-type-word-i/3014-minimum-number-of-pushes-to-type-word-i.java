class Solution {
    public int minimumPushes(String word) {
       int[] arr = new int[26];
       for(char a : word.toCharArray()){
        arr[a- 'a']++ ;
       }
       
       int count = 0 , step = 1 , map = 0;
        for(int i = 25 ; i >= 0 ; i--){
            if(map == 8){
                step++ ;
                map = 0 ;
            }
          if(arr[i] != 0){
            count += step ;
            map++ ;
          }
        }
        return count ;
    }
}