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
    public ListNode reverseList(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;
        }
        int idx = l.size()-1;

        ListNode tmp = head;
        while(tmp!=null){
            tmp.val = l.get(idx);
            tmp = tmp.next;
            idx--;
        }
 
      return head;
    }
}