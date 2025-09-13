/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean hasCycle(ListNode head) {

        int pos = -1;
        ListNode temp = head;
        int size = 0;

        while (temp.next != null) {
            temp = temp.next;
            size++;
        }

    }
}