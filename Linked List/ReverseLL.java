public class ReverseLL{
    public static ListNode reverselist(ListNode head){
        ListNode prev=null,current=head,next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        list.printListNode(list);
        list.printListNode(reverselist(list));
    }
}