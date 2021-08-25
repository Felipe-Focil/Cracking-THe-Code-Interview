//Push, Pop and minStack must be O(1)
public class minStack{
    public static void main(String[] args) {
       
        MyStack cci = new MyStack();

        cci.push(18);
        cci.push(5);
        cci.push(43);
        cci.push(3);
        cci.minStack();
        cci.print();
        cci.pop();
        cci.minStack();
        cci.print();
    }
}
