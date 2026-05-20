1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverse(ListNode head) {
13        if(head == null || head.next == null) return head;
14        ListNode prev = null;
15        ListNode curr = head;
16        while(curr!= null){
17            ListNode nxt = curr.next;
18            curr.next = prev;
19            prev = curr;
20            curr= nxt;
21        }
22        return prev;
23    }
24    public void reorderList(ListNode head) {
25        ListNode slow = head;
26        ListNode fast = head;
27        while(fast!= null && fast.next!= null){
28            slow = slow.next;
29            fast = fast.next.next;
30        }
31        ListNode st = head;
32        ListNode mid = reverse(slow.next);
33        slow.next = null;
34        while(mid!=null){
35            ListNode next1 = st.next;
36            ListNode next2 = mid.next;
37            st.next = mid;
38            mid.next = next1;
39            st= next1;
40            mid = next2;
41        }
42    }
43}