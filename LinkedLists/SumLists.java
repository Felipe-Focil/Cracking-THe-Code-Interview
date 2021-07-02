public class SumLists {
    
    
    SimpleLinkedList function(SimpleLinkedList a, SimpleLinkedList b){
        SimpleLinkedList sum = new SimpleLinkedList();
        Node p1 = a.head;
        Node p2 = b.head;
        boolean addition = false;
        short add = 0;

        while(p1 != null && p2 !=null){
            add = (short) (p1.data + p2.data);
            add += (addition) ? 1:0;
            addition = false;
            if(add>=10){
                addition = true;
                add-=10;
            }

            sum.append(add);
            p1= p1.nxt;
            p2 = p2.nxt;
        }

        if(p1 == null && p2 !=null){
            while(p2!=null){
                sum.append(p2.data);
                p2 = p2.nxt;
            }
        }else if (p2 == null && p1 !=null){
            while(p1!=null){
                sum.append(p1.data);
                p1 = p1.nxt;
            }
        }

        
        return sum;
    }


    SimpleLinkedList inverseFunction(SimpleLinkedList a, SimpleLinkedList b){
        SimpleLinkedList c = new SimpleLinkedList();
        SimpleLinkedList d = new SimpleLinkedList();
        
        int la = a.getLength();
        int lb = b.getLength();

        if(la < lb){
            for(int i = 0; i< (lb-la); i++){
                c.append(0);
            }
        }else if(lb<la){
            for(int i = 0; i< (lb-la); i++){
                d.append(0);
            }
        }
        c.append(a.head);
        d.append(b.head);
        c.invertList();
        d.invertList();

        return function(c, d);
        }


        

    

        public static void main(String[] args) {
        SimpleLinkedList a = new SimpleLinkedList();
        SimpleLinkedList b = new SimpleLinkedList();
        SimpleLinkedList c = new SimpleLinkedList();
        
        SumLists cci = new SumLists();

        a.append(7);
        a.append(1);
        a.append(6);
        a.append(2);
        a.print();
        System.out.println("\t+");
        b.append(5);
        b.append(9);
        b.append(2);
        b.print();
        System.out.println("\t=");
        cci.function(a, b).print();
        c = cci.inverseFunction(a, b);
        c.invertList();
        c.print();

    }
    
}
