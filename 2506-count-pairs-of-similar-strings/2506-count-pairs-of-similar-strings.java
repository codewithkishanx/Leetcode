class Solution {
    public int similarPairs(String[] words) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            HashSet<Character> set = new HashSet<>();
            for (char ch : word.toCharArray()) {
                set.add(ch);
            }

            char[] arr = new char[set.size()];
            int i = 0;
            for (char ch : set) {
                arr[i++] = ch;
            }

            Arrays.sort(arr);
            String key = new String(arr);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int ans = 0;

        for (int freq : map.values()) {
            ans += freq * (freq - 1) / 2;
        }

        return ans;
    }
}