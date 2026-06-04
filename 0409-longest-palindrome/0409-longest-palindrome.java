class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[26];
        int[] charl = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char a = s.charAt(i);
            if(a>= 'a' && a<= 'z'){
                chars[a-'a']++ ;
            }else{
                charl[a-'A']++ ;
            }
        }
        int count = 0 ;
        int single = 0 ;
        for(int i = 0 ; i < 26 ; i++){
            count += (chars[i]/2)*2 ;
             count += (charl[i]/2)*2 ;
            if(chars[i]%2==1){
                single = 1 ;
            }
            if(charl[i]%2==1){
                single = 1 ;
            }
        }
        if(single == 1){
            count++ ;
        }
        return count ;
    }
}