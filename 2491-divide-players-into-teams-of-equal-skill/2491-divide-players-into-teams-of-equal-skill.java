class Solution {
    public long dividePlayers(int[] skill) {
      Arrays.sort(skill);
      long ans = 0 ;
      int n = skill.length;
      int i = 0 , j = n -1 ;  
      int cons = skill[i] + skill[j];
      while(i<j){
       int sum = skill[i] + skill[j];
       if(sum != cons){
        return -1 ;
       }
       ans += (long)(skill[i] * skill[j]);
       i++;
       j-- ;

      }
      return ans ;
    }
}