package LinkedLists;

public class Intersection {

    private class Result {
        Node head;
        Node tail;
        int length;

        public Result(SimpleLinkedList list) {
            head = list.head;
            getTail();
        }

        void getTail() {
            int l = 1;
            Node node = head;
            while (node != null) {
                node = node.nxt;
                l++;
            }
            tail = node;
            length = l;
        }

    }

    public Node function(SimpleLinkedList l1, SimpleLinkedList l2) {
        Result n1 = new Result(l1);
        Result n2 = new Result(l2);

        if (n1.tail == n2.tail) {

            int diference = n1.length - n2.length;

            if (diference >= 0) {
                return findIntersection(l1.head, l2.head, diference);
            } else {
                return findIntersection(l2.head, l1.head, -diference);
            }

        } else {
            return null;
        }

    }

    Node findIntersection(Node h1, Node h2, int diference) {
        Node n1 = h1;
        Node n2 = h2;
        while (diference != 0) {
            n1 = n1.nxt;
            diference--;
        }

        while (n1 != n2) {
            n1 = n1.nxt;
            n2 = n2.nxt;
        }

        return n1;
    }

    public static void main(String[] args) {
        SimpleLinkedList l1 = new SimpleLinkedList();
        SimpleLinkedList l2 = new SimpleLinkedList();
        SimpleLinkedList l3 = new SimpleLinkedList();
        Intersection cci = new Intersection();

        l1.append(1);
        l1.append(5);
        l2.append(5);
        l1.append(2);
        l2.append(3);
        l2.append(10);
        l2.append(10);
        l2.append(10);
        l2.append(10);
        l2.append(10);

        l2.append(4);
        l3.append(5);
        l3.append(6);
        l1.append(l3.head);
        l2.append(l3.head);
        Node intersection = cci.function(l1, l2);

        l1.print();
        l2.print();

        if (intersection != null) {
            System.out.println(intersection.data + " - > " + intersection.nxt.data);
        } else {
            System.out.println("There is no intersection");
        }

    }

}