public class Partition{

    SimpleLinkedList function(SimpleLinkedList list, int x){
        SimpleLinkedList before = new SimpleLinkedList();
        SimpleLinkedList after = new SimpleLinkedList();

        Node current = list.head;

        while(current!=null){
            if(current.data < x){
                before.append(current.data);
            }else{
                after.append(current.data);
            }
            current = current.nxt;
        }

        before.append(after.head);
        return before;
    }

    public static void main(String[] args) {
        SimpleLinkedList l = new SimpleLinkedList();
        SimpleLinkedList l1 = new SimpleLinkedList();
        Partition cci = new Partition();

        l.append(3); l.append(5); l.append(8);
        l.append(5); l.append(10);l.append(2);
        l.append(1);
        l.print();
        cci.function(l, 5).print();
        l1.append(1);l1.append(4); l1.append(3);
        l1.append(2);l1.append(5);l1.append(2);
        l1.print();
        cci.function(l1,3).print();
    }

}