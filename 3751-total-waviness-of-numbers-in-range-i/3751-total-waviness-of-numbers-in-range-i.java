class Solution {
    public int totalWaviness(int num1, int num2) {
       String a = String.valueOf(num1);
       String b = String.valueOf(num2);
       int count = 0 ;
       if(a.length()<3 && b.length()<3){
        return 0 ;
       }
       int start = 0 ;
       if(num1 <101){
        start = 101 ;
       }
       else{
        start = num1 ;
       }
       for(int i =start ; i <= num2 ;i++){
         String val = String.valueOf(i);
        
         for(int j = 0 ; j <= val.length() -3 ;j++){
            char prev = val.charAt(j);
         char mid = val.charAt(j+1);
         char next = val.charAt(j+2);
         if(mid>prev && mid > next){
            count++;
            
         }else if(mid<prev && mid < next){
            count++;
            
         }
         }

       }
       return count ;
    }
}