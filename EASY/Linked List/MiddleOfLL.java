public class MiddleOfLL{
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        int count =0;
        
        if (head==null){
            return null;
        }
        while (temp!=null){
        count++;
        temp=temp.next;
        }
        if (count%2==0){
            while (fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                }
             return slow.next;
        
        }
        else {
            while (fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                }
        }
        
        return slow;
          
            }
        
}