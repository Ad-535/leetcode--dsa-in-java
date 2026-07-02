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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
           return head;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        k = k % n;
        if (k == 0)
            return head;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = n - k; i < n; i++) {
            ans.add(list.get(i));
        }
        for (int i = 0; i < n - k; i++) {
            ans.add(list.get(i));
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int x : ans) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }
}