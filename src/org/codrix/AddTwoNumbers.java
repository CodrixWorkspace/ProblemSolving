package org.codrix;
//https://leetcode.com/problems/add-two-numbers/

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    // Helper function to print the resulting linked list
    public void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        // Example 1
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode sum1 = solution.addTwoNumbers(l1, l2);
        System.out.print("Sum of l1 and l2: ");
        solution.printLinkedList(sum1);

        // Example 2
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode sum2 = solution.addTwoNumbers(l3, l4);
        System.out.print("Sum of l3 and l4: ");
        solution.printLinkedList(sum2);

        // Example 3
        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode sum3 = solution.addTwoNumbers(l5, l6);
        System.out.print("Sum of l5 and l6: ");
        solution.printLinkedList(sum3);
    }
}
