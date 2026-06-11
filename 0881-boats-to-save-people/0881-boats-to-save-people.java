class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length ;
        int left = 0 , right = n-1 ;
        int count = 0 ;
        while(left< right){
            if(people[right] + people[left] <= limit){
                left++ ;
                right-- ;
            }
            else if(people[right] + people[left] >= limit){
                right-- ;
            }
            count++ ;
        }
        if(left == right){
            count++;
        }
        return count ;
    }
}