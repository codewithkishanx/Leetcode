class Solution {
    public String smallestPalindrome(String s) {
        int len = s.length() ;
        char[] a = s.substring(0 , len/2).toCharArray();
        Arrays.sort(a); 
        StringBuilder sb = new StringBuilder();
        for(char b :  a){
            sb.append(b);
        }
        char mid = 0 ;
        String ans = "" ;
        if(len%2 == 1){
            mid = s.charAt(len/2);
         return ans = sb.toString() + mid + sb.reverse().toString() ;
        }
        
         ans = sb.toString() + sb.reverse().toString() ;
        return ans ;
 }      
}