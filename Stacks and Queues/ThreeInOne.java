

public class ThreeInOne {
    int array[];
    int next[];
    int top[];
    int free;
    int n;



    public ThreeInOne(int n){
        this.n = n;
        array = new int[n];
        next = new int[n];
        top = new int [3];

        for(int i = 0;i<n-2;i++){
            next[i] = i+1;
        }
        next[n-1] = -1;
        top[0] = top[1] = top[2] = -1;
        free = 0;
    }

    public void push(int stack, int element){
        int newFree = free;
        if(free !=-1){
            array[free] = element;
            newFree=next[free];
            if(top[stack] == -1){
                next[free] = -1;
                /*
                Just in case pop didnt work as expected

                next[free] = (0 - stack) - 2;
                

                """
                    -1 No Space
                    -2 First
                    -3 Second
                    -4 Third
                """
                */
            }else{
                next[free] = top[stack];
            }
            top[stack] = free;
            free = newFree;
        }
    }

    public void pop(int stack){
       int newFree = top[stack];
       top[stack] = next[newFree];
       if(next[newFree] != -1){
            next[newFree] = next[next[newFree]];
       }else{
           next[newFree] = free;
       }
        
       free = newFree;
    }

    public void print(int stack){
        
        int i = top[stack];
        System.out.print("\n");
        while(i != -1){
            System.out.print(array[i] + " -> ");
            i = next[i];
        }
        System.out.print("\n");
    }

    public void print(){
        System.out.println("__________");
        print(0);
        print(1);
        print(2);
        System.out.println("__________");
    }
    
      
    
    public void peek(int stack){
        System.out.println("________");
        
        if(top[stack ]== -1){
            System.out.println("Empty");
        }else{
            System.out.println(array[top[stack]]);
        }
        System.out.println("________");
    }

    public boolean IsEmpty(int stack){
        if(top[stack] != -1){
            return false;
        }else{
            return true;
        }
}

    

    public static void main(String[] args) {
        ThreeInOne s1 = new ThreeInOne(20);
        System.out.println(s1.IsEmpty(0));
        s1.push(0, 1);
        s1.push(0, 2);
        s1.push(0, 3);
        s1.push(0, 4);

        s1.push(1, 11);
        s1.push(1, 12);
        s1.push(1, 13);
        s1.push(1, 14);

        s1.push(2, 21);
        s1.push(2, 22);
        s1.push(2, 23);
        s1.push(2, 24);
        s1.push(2, 25);
        s1.push(1, 26);
        s1.push(2, 27);
        s1.push(2, 28);

        s1.print();
        s1.pop(0);
        s1.pop(1);
        s1.pop(2);
        s1.print();

        s1.push(2, 103);
        

        s1.print();
        s1.peek(0);
        s1.peek(1);
        s1.peek(2);
        System.out.println(s1.IsEmpty(0));
        
    }
}
