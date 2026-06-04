class Solution {
    public int maxDepth(String s) {
       int count = 0 ,max =0 ;
       for(char a : s.toCharArray()){
        if(a == '{' || a == '[' || a == '('){
            count++ ;
        }
        else if(a == ']' || a == '}' || a == ')'){
            count-- ;
        }
        max = Math.max(max , count );
       } 
       return max ;
    }
}