class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int ans = 0 ;
        int sec = Integer.parseInt(endTime.substring(6,8))- Integer.parseInt(startTime.substring(6,8)) ;

         int min = Integer.parseInt(endTime.substring(3,5))- Integer.parseInt(startTime.substring(3,5)) ;

          int hour = Integer.parseInt(endTime.substring(0,2))- Integer.parseInt(startTime.substring(0,2)) ;

          ans += sec ;
          ans += min*60 ;
          ans += hour*60*60 ;
          return ans ;
    }
}