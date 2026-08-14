package Queue;

class Queue{
    int[]arr;
    int front;
    int rear;

    public Queue(int size) {
        arr=new int[size];
        front=-1;
        rear=-1;
    }

    //Insert → Rear side → enqueue()
    public void push(int ele) {

        if(front==-1) {
            front=0;
            rear=0;
            arr[front]=ele;
            return;
        }
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=ele;
    }
    //Remove → Front side → dequeue()
    public int pop() {
        if(isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        int ele = arr[front];
        front=front+1;

        if(front>rear) {
            front=-1;
            rear=-1;
        }
        return ele;
    }

    public int peek() {
        if(front==-1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int ele = arr[front];
        return ele;
    }

    public boolean isEmpty() {
        if(front==-1) {
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(rear==arr.length-1){
            return true;
        }
        return false;
    }
    public void display() {
        for(int i=front;i<=rear;i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
public class ImplementationQueueUsingArray {
    public void sayHello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(3);
        q.push(4);
        q.display();
    }
}
