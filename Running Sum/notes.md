# Intuition
I directly knew how to resolve this problem, however there is one little detail that makes it a little bit tricky.

# Approach
I am not sure if this is the optimal way of doing it but to be able to run just one for loop with a base case for every number, I had to assign the first index of the toReturn table so that I don't get out of bound Exception.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int[] runningSum(int[] nums) {
        int[] toReturn = new int[nums.length];
        toReturn[0] = nums[0];
        for (int i = 1; i < nums.length; i ++){
            toReturn[i] = nums[i] + toReturn[i -1];
        }
        return toReturn;
    }
}
```
