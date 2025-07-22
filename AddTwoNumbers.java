
package demo;
public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode tail = dummyHead;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int digit1 = (l1 != null) ? l1.val : 0;
                int digit2 = (l2 != null) ? l2.val : 0;
                int sum = digit1 + digit2 + carry;
                int digit = sum % 10;
                carry = sum / 10;

                tail.next = new ListNode(digit);
                tail = tail.next;

                l1 = (l1 != null) ? l1.next : null;
                l2 = (l2 != null) ? l2.next : null;
            }

            return dummyHead.next;
        }
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution sol = new Solution(); // No error now
        ListNode result = sol.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
