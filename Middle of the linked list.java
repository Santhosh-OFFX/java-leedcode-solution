class Solution {
    public ListNode middleNode(ListNode head) {
      
      int mid=list_length(head);
      ListNode temp=head;
      for(int i=1;i<mid;i++){
        temp=temp.next;
      }
      return temp;

    }
    int list_length(ListNode h){
        ListNode temp=h;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return (cnt/2)+1;
    }
}