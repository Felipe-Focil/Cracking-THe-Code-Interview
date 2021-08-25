package LinkedLists;

import java.util.Stack;

public class Palindrome {

    public boolean function(SimpleLinkedList list) {
        boolean isPalindrome = true;
        Node slow = list.head;
        Node fast = list.head;
        Stack<Integer> q = new Stack<Integer>();

        while (fast != null) {
            if (fast.nxt == null) {
                fast = fast.nxt;
                slow = slow.nxt;
            } else {
                fast = fast.nxt.nxt;
                q.push(slow.data);
                slow = slow.nxt;
            }
        }

        while (slow != null && isPalindrome == true) {
            if (slow.data == (int) q.peek()) {
                q.pop();
                slow = slow.nxt;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        Palindrome cci = new Palindrome();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.append(2);
        list.append(3);
        list.append(2);
        list.append(1);

        System.out.println(cci.function(list));

    }

}
