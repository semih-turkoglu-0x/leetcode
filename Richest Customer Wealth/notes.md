# Intuition
Working with 2D arrays haven't always been my best, so I'm glad that I can practice a bit more with this seemingly pretty straight-forward problem.

# Approach
I know that the solution of this problem is not optimal at all since I think that the last for loop can be avoided, I will come back to this problem later to find a better solution to it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int[] wealthes = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wealthes[i] += accounts[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < wealthes.length; i++) {
            if(wealthes[i] >= max) {
                max = wealthes[i];
            }
        }

        return max;
    }
}
```
