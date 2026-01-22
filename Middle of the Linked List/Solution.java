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
