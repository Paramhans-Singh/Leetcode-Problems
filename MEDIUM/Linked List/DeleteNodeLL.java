public class DeleteNodeLL {
    public void deleteNode(ListNode node) {
        
        // copy the value of next node in current node
                   node.val=node.next.val;
        //  and link the current node to the next of next node 
        //  as we don't have access to head so swap the elements like this 
                   node.next=node.next.next;
            }
        
}
 class ListNode {
        int val;
        ListNode next;
     ListNode(int x) { val = x; }
 }
   