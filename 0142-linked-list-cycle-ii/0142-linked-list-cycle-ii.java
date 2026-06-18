/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode tmp = head;
        Set<ListNode> k = new HashSet<>();
        while(tmp!=null){
            if(k.contains(tmp)){
                return tmp;
           }
            k.add(tmp);
            tmp = tmp.next;
        }
         return null;
    }
}