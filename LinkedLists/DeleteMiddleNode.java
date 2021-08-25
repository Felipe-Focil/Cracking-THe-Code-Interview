package LinkedLists;

public class DeleteMiddleNode {

    void function(SimpleLinkedList list) {
        Node slow = list.head;
        Node fast = list.head;

        Node toDelete = slow;

        while (fast.nxt != null) {
            if (fast.nxt.nxt != null) {
                fast = fast.nxt.nxt;
            } else {
                fast = fast.nxt;
            }
            toDelete = slow;
            slow = slow.nxt;
        }

        if (list.head.nxt.nxt != null) {
            toDelete.nxt = slow.nxt;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList l = new SimpleLinkedList();
        DeleteMiddleNode cci = new DeleteMiddleNode();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);
        l.append(5);
        l.append(6);
        l.append(7);
        l.append(8);
        l.print();
        cci.function(l);
        l.print();
        cci.function(l);
        l.print();
        cci.function(l);
        l.print();
        cci.function(l);
        l.print();
        cci.function(l);
        l.print();
        cci.function(l);
        l.print();
        cci.function(l);
        l.print();

    }

}
