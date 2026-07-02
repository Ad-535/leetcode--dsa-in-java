class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        while (l1 != null) {
            a.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            b.add(l2.val);
            l2 = l2.next;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int carry = 0;
        while (i < a.size() || i < b.size() || carry != 0) {
            int sum = carry;
            if (i < a.size())
            sum += a.get(i);
            if (i < b.size())
            sum += b.get(i);
            ans.add(sum % 10);
            carry = sum / 10;
            i++;
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