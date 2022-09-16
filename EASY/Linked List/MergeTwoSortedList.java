public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
 ListNode t2= list2;
 ListNode temp=null;
 
 if (t1==null){
     return t2;
 }
 if (t2==null){
     return t1;
 }
 
 if (t1.val <= t2.val) {
     temp = t1;
     temp.next = mergeTwoLists(t1.next, t2);
 }
 else {
       temp = t2;
     temp.next = mergeTwoLists(t1, t2.next);
 }
 return temp;
  
    
}
}