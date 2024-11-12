package LinkedListQuestions;

public class reverse {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode x=reverseList(head.next);
        ListNode temp=head.next;
        temp.next=head;
        head.next=null;
        return x;

        // ListNode newhead=reverseList(head.next);
        // head.next.next=head;  head.next=temp
        // head.next=null;
        // return newhead;
        
    }
    
}
