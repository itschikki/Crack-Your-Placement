public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode left = head;
        ListNode right = reverseList(slow);

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        list.printListNode(list);
        boolean Result = isPalindrome(list);
        System.out.println(Result);

    }

}
