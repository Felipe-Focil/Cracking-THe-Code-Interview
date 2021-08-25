public class SetOfStacks{

    private class StackNodes{
        MyStack current;
        StackNodes next;
    

        public StackNodes(MyStack stack){
            current = stack;
            next = null;
        }
    }
    int limit;
    int nStacks = 0;

    StackNodes head, tail;
    public SetOfStacks(int limit){
        this.limit = limit;
    }

    public void push(int element){
        if(nStacks ==0){
            StackNodes n  = new StackNodes(new MyStack());
            head = tail= n;
            nStacks++;
        }else if(tail.current.size >=limit){
            StackNodes n = new StackNodes(new MyStack());
            tail.next = n;
            tail = n;
            nStacks++;
        }
            
          tail.current.push(element);
    }

    public void pop(){
        if(tail.current.size == 1){
            StackNodes n = head;
            while(n.next != tail){
                n = n.next;
            }
            tail.current.pop();
            n.next = null;
        }else{
            tail.current.pop();
        }
    }

    public void popAt(int index){
        StackNodes n = head;
        StackNodes prev = null;
        MyStack temp = new MyStack();
        int d,j = index;
        while(j>limit){
            prev = n;
            n = n.next;
            j-=limit;
        }
        for(int i = 1; i<j;i++){
            d = n.current.top.data;
            temp.push(d);
            n.current.pop();
        }
       if(!n.current.isEmpty()){
            n.current.pop();
       }
         
        while(!temp.isEmpty()){
            d = temp.top.data;
            n.current.push(d);
            temp.pop();
        }

        if(n.current.isEmpty()){
            prev.next = n.next;
            nStacks--;
        }

    }

    public void print(){
        StackNodes n = head;
      for(int i = 1 ; i<=nStacks;i++){
            System.out.println("Stack " + i);
            n.current.print();
            n = n.next;
      }
    }

    public static void main(String[] args) {
        SetOfStacks cci = new SetOfStacks(3);
        for(int i = 1 ;i<=12;i++){
            cci.push(i);
        }
        cci.popAt(5);
        cci.pop();
        cci.print();
    }

}