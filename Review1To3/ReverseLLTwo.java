class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

 class Solution {

  public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Move prev to node before left
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode current = prev.next;

        // Reverse nodes
        for (int i = 0; i < right - left; i++) {

            ListNode nextNode = current.next;

            current.next = nextNode.next;

            nextNode.next = prev.next;

            prev.next = nextNode;
        }

        return dummy.next;
    }

    // Display linked list
   static public void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

public class ReverseLLTwo{

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution s = new Solution();

        head = s.reverseBetween(head, 2, 4);

        s.printList(head);
    }
}