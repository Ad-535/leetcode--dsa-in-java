/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int len1 = 0;
        int len2 = 0;
        while(tempA!=null){
            tempA = tempA.next;
            len1++;
        }
        while(tempB!=null){
            tempB = tempB.next;
            len2++;
        }
        tempA = headA;
        tempB = headB;
        if(len1>len2){
        for(int i=1;i<=len1-len2;i++){
            tempA = tempA.next;
         }
        }
        else{
            for(int i=1;i<=len2-len1;i++){
             tempB = tempB.next;
            }
        }
        while(tempA!=tempB){
         tempA = tempA.next;
         tempB = tempB.next;
        }
        return tempA;
    }
}