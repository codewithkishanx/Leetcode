class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
     
        String val = "123456789" ;
        for(int i = 0 ; i < 9 ; i++){
            for(int j = i+1 ; j < 9  ; j++){
                int temp = Integer.parseInt(val.substring(i,j+1));
                if(temp >= low && temp <= high){
                    list.add(temp);
                }
                else if(temp > high){
                    break ;
                }
            }
        }
        Collections.sort(list);
        return list ;
    }
}