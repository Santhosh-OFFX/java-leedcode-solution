class Solution {
    public ListNode reverseList(ListNode  head){ 
      ListNode h2=null;
      ListNode temp=head;
      while(temp!=null) {
        head=head.next;
        temp.next=h2;
        h2=temp;
        temp=head;
      }  
      return h2;
    }
}