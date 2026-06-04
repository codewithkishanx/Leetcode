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
    public ListNode sortList(ListNode head) {
       if(head == null || head.next == null )return head ; 
       ArrayList<Integer> list = new ArrayList<>();
       while(head != null){
        list.add(head.val);
        head = head.next ;
       }
       Collections.sort(list);
       ListNode k = new ListNode(0);
       ListNode temp = k ; 
       for(int i : list){
         ListNode val = new ListNode(i);
         temp.next = val ;
         temp = temp.next ;
       }
       return k.next ;
    }
}