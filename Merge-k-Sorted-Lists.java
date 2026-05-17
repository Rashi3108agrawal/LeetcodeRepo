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
12
13    public ListNode mergeKLists(ListNode[] lists) {
14        if (lists == null || lists.length == 0) {
15            return null;
16        }
17        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
18
19        for (ListNode node: lists) {
20            if (node != null) {
21                pq.add(node);
22            }
23        }
24
25        ListNode dummy = new ListNode();
26        ListNode current = dummy;
27
28        while (!pq.isEmpty()) {
29            ListNode smallest = pq.poll();
30            current.next = smallest;
31            current = current.next;
32
33            if (smallest.next != null) {
34                pq.add(smallest.next);
35            }
36        }
37        return dummy.next;
38
39    }
40}