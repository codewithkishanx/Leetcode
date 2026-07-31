class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char a : word.toCharArray()){
            freq[a-'a']++ ;
        }
        int count = 0 , step = 1 , map = 0 ;
        Arrays.sort(freq);
        for(int i = 25 ; i >= 0 ; i--){
            if(freq[i]!= 0){
                map++ ;
                count += step*freq[i];
            }
            if(map == 8){
                step++ ;
                map = 0 ;
            }
        } 
        return count ;
    }
}