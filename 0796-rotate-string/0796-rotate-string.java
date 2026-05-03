class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
       StringBuilder abc = new StringBuilder(s);
       abc.append(s);
       s = abc.toString();
       if(s.indexOf(goal) != -1){
        return true ;
       }

       return false ; 
    }
}