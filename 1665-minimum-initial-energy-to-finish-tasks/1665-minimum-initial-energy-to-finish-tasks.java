import java.util.*;

class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) ->
            Integer.compare(
                (b[1] - b[0]),
                (a[1] - a[0])
            )
        );

        int energy = 0;
        int current = 0;

        for (int[] t : tasks) {

            int actual = t[0];
            int minimum = t[1];
            if (current < minimum) {
                energy += (minimum - current);
                current = minimum;
            }

            current -= actual;
        }

        return energy;
    }
}