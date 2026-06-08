class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int[] arr =new int[nums.length] ;
      int j = 0 ;
      int count = 0 ;
      for(int i : nums){
        if(i < pivot){
            arr[j++] = i ;
        }
        else if(i == pivot){
            count++ ;
        }
      }  
      for(int i = 0 ; i < count ; i++){
        arr[j++] = pivot ;
      }
      for(int i : nums){
        if(i > pivot){
            arr[j++] = i ;
        }
      } 
      return arr ; 
    }
}