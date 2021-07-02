public class ReturnKthToLast {

    // O(n)
    Node function(SimpleLinkedList list, int k){
        int size  = 0 - k;

        Node end  = list.head;
        Node index = list.head;

        while(end.nxt != null){
            size++;
            if(size > 0){
                index = index.nxt;
            }
            end = end.nxt;
        }
        return index;

    }

    public static void main(String[] args) {
        SimpleLinkedList l = new SimpleLinkedList();
        ReturnKthToLast cci = new ReturnKthToLast();
        l.append(3);
        l.append(42);
        l.append(23);
        l.append(11);
        l.append(1);
        l.append(3);
        l.append(11);
        l.append(6);
        l.append(7);
        l.print();
        System.out.println(cci.function(l, 2).data);
        System.out.println(cci.function(l, 0).data);
        System.out.println(cci.function(l, 3).data);
        System.out.println(cci.function(l, 9).data);
    }


}
