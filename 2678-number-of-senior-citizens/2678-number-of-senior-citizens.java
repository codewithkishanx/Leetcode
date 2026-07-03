class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;

        int cnt = 0;
        for(int i = 0; i < n; i++){
            int umar = age(details[i]);
            if(umar > 60){
                cnt++;
            }
        }
        return cnt;
    }

    static int age(String str){
        int a = str.charAt(11) - '0';
        int b = str.charAt(12) - '0';
        return (a * 10) + b;
    }
}