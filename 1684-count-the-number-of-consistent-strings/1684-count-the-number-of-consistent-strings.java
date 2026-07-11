class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      HashSet<Character> set = new HashSet<>();
      int count = 0 ;
        for(char a : allowed.toCharArray()){
            set.add(a);
        }
        for(String a : words){
            boolean valid = true ;
            for(char b : a.toCharArray()){
                if(!set.contains(b)){
                    valid = false ;
                }
            }
            if(valid){
                count++ ;
            }
        }
        return count ;
    }
}