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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        if(list1 == null) return list2;
14        if(list2!=null){
15            if(list1.val<= list2.val){
16                list1.next = mergeTwoLists(list1.next, list2);
17                return list1;
18            }else{
19                list2.next = mergeTwoLists(list1, list2.next);
20                return list2;
21            }
22        }
23        return list1;
24    }
25}