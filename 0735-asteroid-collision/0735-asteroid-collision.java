class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        for (int i = 0; i < asteroids.length; i++) {

            if (asteroids[i] < 0) {

                for (int j = i - 1; j >= 0; j--) {

                    if (asteroids[j] == 0) {
                        continue;
                    }

                    if (asteroids[j] > 0) {

                        int left = asteroids[j];
                        int right = Math.abs(asteroids[i]);

                        if (right > left) {
                            asteroids[j] = 0;
                            continue;
                        }

                        else if (right < left) {
                            asteroids[i] = 0;
                            break;
                        }

                        else {
                            asteroids[j] = 0;
                            asteroids[i] = 0;
                            break;
                        }
                    }
                }
            }
        }

        int count = 0;

        for (int asteroid : asteroids) {
            if (asteroid != 0) {
                count++;
            }
        }

        int[] ans = new int[count];
        int k = 0;

        for (int asteroid : asteroids) {
            if (asteroid != 0) {
                ans[k++] = asteroid;
            }
        }

        return ans;
    }
}