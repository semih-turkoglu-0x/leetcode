# Intuition
My first thought on that problem was that I had to maintain a table of String AND an ArrayList because somehow I thought that I needed to maintain track in a table of the index of each element, however I quickly realized that the second data structure (here, the table) was not needed andd it added complexity that was not necessary, while copying every element of the table into the ArrayList. 

# Approach
I started by declaring an ArrayList and then started by writing each condition that had to be met, then I created an $$if$$ branch to test all the cases. I got wrong in my first tries because of the limit of the for loop that I chose, which did not include n in the beginning.

# Complexity
- Time complexity:
$$(O)n$$

- Space complexity:
$$O(1)$$

# Code
```java []
class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> toReturn = new ArrayList<>();

        for (int i=1; i <= n ; i++) {

            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;

            if (divisible3 && divisible5) {
                toReturn.add("FizzBuzz");
            } else if (divisible3) {
                toReturn.add("Fizz");
            } else if (divisible5) {
                toReturn.add("Buzz");
            } else {
                toReturn.add(Integer.toString(i));
            }
        }
        return toReturn;
    }
}
```
