class Solution {
    public boolean canReach(int[] arr, int start) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {

            int pop = q.remove();
            if (arr[pop] < 0) {
                continue;
            }
            if (arr[pop] == 0) {
                return true;
            }

            int jump = arr[pop];
            arr[pop] = -arr[pop];
            if (pop + jump < arr.length) {
                q.add(pop + jump);
            }
            if (pop - jump >= 0) {
                q.add(pop - jump);
            }
        }

        return false;
    }
}