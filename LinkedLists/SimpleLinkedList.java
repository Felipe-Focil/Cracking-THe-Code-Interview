public class SimpleLinkedList{
    Node head = null;

    public void append(int data){

        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.nxt != null){
            current = current.nxt;
        }
        current.nxt = new Node(data);
    }

    public void append(Node n){
        if(head == null){
            head = n;
            return;
        }
        Node current = head;
        while(current.nxt != null){
            current = current.nxt;
        }
        current.nxt = n;
    }

    public void print(){
        Node current = head;

        while(current !=null){
            System.out.print(current.data + " - > ") ;
            current = current.nxt;
        }
        System.out.print("null \n");
    }

    int getLength(){
        int length = 0;
        Node n = head;

        while(n !=null){
            length++;
            n = n.nxt;
        }

        return length;
    }

    void invertList(){
        Node left = null;
        Node current = head;
        Node right = head.nxt;

        while(current!=null){
            current.nxt = left;
            left = current;
            current = right;

            if(right != null){
                right = right.nxt;
            }

            head = left;

        }
    }

    Node index(int i){
        int idx = 0;
        Node n = head;
        while(idx != i || n == null){
            n = n.nxt;
            idx++;
        }

        return n;
        
    }

  
}