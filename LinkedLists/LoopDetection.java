public class LoopDetection {

    public Node function(SimpleLinkedList l){

        Node  slow = l.head.nxt, fast = l.head.nxt.nxt;
        
        while(slow != null && fast !=null){
            if(slow == fast){
                break;
            }

            slow = slow.nxt;
            fast = fast.nxt.nxt;

        }

        if(slow == null || fast == null){
            return null;
        }

        slow = l.head;

        while(slow != fast){
            slow = slow.nxt;
            fast = fast.nxt;
        }

        return fast;
    }

    public static void main(String[] args) {
        SimpleLinkedList l = new SimpleLinkedList();
        Node n = new Node(10);
        LoopDetection cci = new LoopDetection();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);
        l.append(5);
        l.append(6);
        l.append(7);
        l.append(8);
        l.append(9);
        n.nxt = l.index(0);
        l.append(n);
        Node cycle = cci.function(l);
        if(cycle == null){
            System.out.println("No Cycle");
        }else{
            System.out.println(cycle.data);
        }
    }
    
}
