# Intuition
My first thought on this problem was that I had to do it the classic iterative way. However, after a while, I struggled so much that I understood that it wasn't the way to go! After looking at the discussion on this problem, I saw a lot of people talking about the XOR operator. I never used it before so it was great to discover how this works, and I think that I found an elegant way to solve this problem.
# Approach
I only declared a single variable to store the result of the XOR operation, after applying the operation on both strings, I found the only different character of the two strings.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
## My first approach...
```java
public class Difference {
	public char findTheDifference(String s, String t) {
		int counter = 0;
		char s1 = 'k';
		char t1;
		while (counter <= t.length()) {
			if (counter < s.length()) s1 = s.charAt(counter);
			t1 = t.charAt(counter);
			if (t1 != s1) return t1;
			counter ++;
		}
		return 'a';
	}
}
```
## And then my final solution ! Much cleaner
```java []
class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char cs : s.toCharArray()) res ^= cs;
        for(char ct : t.toCharArray()) res ^= ct;
        return res;
    }
}
```