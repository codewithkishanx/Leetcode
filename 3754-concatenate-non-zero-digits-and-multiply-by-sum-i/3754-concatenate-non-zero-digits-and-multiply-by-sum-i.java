class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0 ;
        long ans = 0 ;
        int sum = 0 ;
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
            int digit = n%10 ;
            if(digit != 0){
                sb.append(digit);
                sum += digit ;
            }
            n = n/10 ;
        }
        ans = Integer.parseInt(sb.reverse().toString());
        ans = ans*sum ;
        return ans ;
    }
}