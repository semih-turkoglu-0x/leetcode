# Intuition
My first intuition was that I had to use a pointer to keep track of the number of nodes present in the head.

# Approach
I initiated a pointer to the current head Node, went through all the elements, and then recreated a loop to stop the Node at the middle index... After seeing the solution to that problem, I realized how inefficient this method seemed. I'll keep in mind that I can keep track of the middle by using 2 pointers.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int counter = 1;
        ListNode tmp = head;
        while (tmp.next != null) {
            counter ++;
            tmp = tmp.next;
        }

        for (int i = 0; i < counter/2; i++) {
            head = head.next;
        }
        return head;
    }
}
```
