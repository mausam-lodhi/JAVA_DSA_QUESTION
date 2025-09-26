class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
     

        ListNode newNode = new ListNode(-1);
        ListNode temp = newNode;

        while (list1!= null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            } else {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
        }
        while (list1 != null) {
            temp.next = list2;
            temp = list2;
            list2 = list2.next;
        }

        while (head2 != null) {
            temp.next = list1;
            temp = list1;
            list1 = list1.next;
        }
        return newNode.next;
    }
}