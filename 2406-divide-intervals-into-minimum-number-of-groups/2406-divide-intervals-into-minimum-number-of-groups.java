class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length ;
      int[] heatMap = new int[10000005];  
      for(int[] a : intervals){
        heatMap[a[0]]++;
        heatMap[a[1]+1]-- ;
      }
      int max = 0 , curr = 0;
      for(int i : heatMap){
        curr += i ;
        max= Math.max(max , curr);
      }
    return max ;
    }
}