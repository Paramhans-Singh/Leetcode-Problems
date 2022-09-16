public class PalindromeLL {
    public ListNode reverse(ListNode temp){
       if (temp.head==null){
          return temp;
       }
       ListNode reverseTail=temp.head;
       ListNode smallHead=reverse(temp.head);
       reverseTail.head=temp;
       temp.head=null;

       return smallHead;
    } 
}
