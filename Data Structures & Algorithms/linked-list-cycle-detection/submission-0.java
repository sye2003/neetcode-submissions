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
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> cycle = new HashSet<>();

        ListNode current = head;


        while(current!=null){
            
            if(cycle.contains(current)){
                return true;
            }

            cycle.add(current);
            current = current.next;
        }

        return false;


        
    }
}
