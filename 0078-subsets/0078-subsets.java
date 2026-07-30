class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subseq( 0  ,  curr ,  ans ,  nums );
    return ans ;
    }
    private void  subseq(int index , List<Integer> x , List<List<Integer>> y , int[] arr){
        //base case 
        if(index == arr.length){
            y.add(new ArrayList<>(x));
            return ;
        }

        //include
        x.add(arr[index]);
        //pick 

        subseq( index +1  ,  x ,  y ,  arr);
        //remove 

        x.remove(x.size() - 1 );
        // no pick
        subseq( index +1  ,  x ,  y ,  arr);
    }
}