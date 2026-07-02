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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ArrayList<Integer> l = new ArrayList<>();
    ListNode temp1 = list1;
    ListNode temp2 = list2;
    while (temp1 != null) {
        l.add(temp1.val);
        temp1 = temp1.next;
    }
    while (temp2 != null) {
    l.add(temp2.val);
    temp2 = temp2.next;
    }
    Collections.sort(l); 
    ListNode dummy = new ListNode(-1);
    ListNode tail = dummy;
        for(int v:l){
            ListNode node = new ListNode(v);
            tail.next = node;
            tail = node;
        }
         return dummy.next;
    }
}