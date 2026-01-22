# Intuition
Again pretty straightforward problem, the fact that you have to use a while loop is pretty obvious since you don't know how many iterations you will need.

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
$$O(n)$$

- Space complexity:
$$O(1)$$

# Code
```java []
class Solution {
    public int numberOfSteps(int num) {
        int counter = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /=2;
            } else {
                num -= 1;
            }
            counter ++;
        }
        return counter;
    }
}
```
