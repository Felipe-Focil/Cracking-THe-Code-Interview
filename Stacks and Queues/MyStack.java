
public class MyStack {
    StackNode top = null;
    int size;

    public MyStack(){
       size =0;
    }   

    public void push(int element){
        size++;
        if(top ==null){
            top = new StackNode(element);
            top.nxt = null;
            top.min = element;
        }else{
            StackNode n = new StackNode(element);
            n.nxt = top;
            if(element < top.min){
                n.min = element;
            }else{
                n.min = top.min;
            }
            top = n;

        }


    }

    public void pop(){
        size--;
        top = top.nxt;
    }

    public void peek(){
        System.out.println(top.data);
    }

    public void print(){
        StackNode n = top;
        System.out.println("_______________\n");
        if(isEmpty()){
            System.out.print("\n Empty");
        }else{
            while(n != null){
                System.out.print(n.data + " <- ");
                n = n.nxt;
            }
        }
        System.out.println("\n_______________");
        
    }

    public void minStack(){
        System.out.println(top.min);
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
}
