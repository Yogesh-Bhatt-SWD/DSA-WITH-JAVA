package Stack;
class Stack{
    int[]arr;
    int top;

    public Stack(int size) {
        arr=new int[size];
        top=-1;
    }
    public void push(int ele) {
        if(top==arr.length-1) {
            System.out.println("Stack is full");
            return;
        }
        top=top+1;
        arr[top]=ele;
    }

    public int pop() {
        if(top==-1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int ele = arr[top];
        top=top-1;
        return ele;
    }

    public int peek(){
        if(top==-1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int ele = arr[top];
        return ele;
    }
    //Top to Bottom
    public void display() {
        for(int i=top;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
    }

    public int size() {
        return top+1;
    }

}
public class ImplementationStackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack(7);
        st.push(5);
        st.push(6);
        st.push(9);
        st.push(10);
        st.pop();
        st.push(91);
        st.display();
        System.out.println();
        System.out.println("Size of stack is "+st.size());
        System.out.println(st.peek());
    }
}
