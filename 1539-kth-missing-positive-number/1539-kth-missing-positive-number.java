class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean[] brr = new boolean[2001];
        for(int i : arr){
            brr[i-1] = true ;
        }
        int count = k ;
        for(int i = 0 ; i < 2001 ; i++){
            if(count == 0){
                return i ;
            }
            if(brr[i] == false){
                count-- ;
            }
            
        }
        return -1 ;
    }
}