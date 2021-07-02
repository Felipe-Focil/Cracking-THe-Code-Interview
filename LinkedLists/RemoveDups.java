import java.util.HashMap;
import java.util.HashSet;

public class RemoveDups{
    
    //Time O(n), Space O(n)
    public void functionWithBuffer(SimpleLinkedList list){
        HashSet<Integer> set = new HashSet<Integer>();
        Node current = list.head;
        Node prev = null;

        while(current != null){
            if(set.contains(current.data)){
                prev.nxt = current.nxt;
            }else{
                set.add(current.data);
                prev = current;
            }
            current = current.nxt;
        }

        

    }

    //Time O(n^2), Space O(1)
    public void functionWithoutBuffer(SimpleLinkedList list){
        Node slow = list.head;
        

        while(slow != null){
            Node fast = slow;
            while(fast.nxt != null){
                if(fast.nxt.data == slow.data){
                    fast.nxt = fast.nxt.nxt;
                }else{
                    fast = fast.nxt;
                }
            }
            slow = slow.nxt;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList l1 = new SimpleLinkedList();
        SimpleLinkedList l2 = new SimpleLinkedList();
        RemoveDups cci = new RemoveDups();
        l1.append(2);
        l1.append(1);
        l1.append(4);
        l1.append(3);
        l1.append(10);
        l1.append(4);
        l1.append(3);
        l1.append(3);
        l1.append(3);
        
        l1.print();
        cci.functionWithBuffer(l1);
        l1.print();

        l2.append(3);
        l2.append(42);
        l2.append(23);
        l2.append(11);
        l2.append(1);
        l2.append(3);
        l2.append(11);
        l2.append(6);
        l2.append(7);
        
        l2.print();
        cci.functionWithoutBuffer(l2);
        l2.print();
    }

}
