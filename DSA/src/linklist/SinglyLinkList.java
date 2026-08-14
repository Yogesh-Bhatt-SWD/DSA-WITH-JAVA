package linklist;

import java.util.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkList {

    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head;
        head = newNode;

        return head;
    }

    public static void display(Node head) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return; // <-- Added
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();
    }

    public static Node insertAtTail(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    public static Node deleteAtHead(Node head) {

        if (head == null)
            return null;

        head = head.next;

        return head;
    }

    public static int length(Node head) {

        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static Node deleteAtPos(Node head, int pos, int length) {

        if (head == null) {
            return null;
        }

        // <-- Added
        if (pos <= 0 || pos > length) {
            System.out.println("Invalid Position");
            return head;
        }

        if (pos == 1) {
            head = head.next;
            return head;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        // <-- Added (extra safety)
        if (temp == null || temp.next == null) {
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }
    public static Node deleteByValue(Node head, int value) {

        if (head == null)
            return null;

        Node prev = head;
        Node curr = head.next;

        if (prev.data == value) {
            prev = curr;
            return prev;
        }

        while (curr != null) {

            if (curr.data == value) {
                prev.next = curr.next;
                return head;
            }

            prev = curr;
            curr = curr.next;
        }

        return head;
    }
    public static boolean isPresent(Node head,int data) {
        Node temp = head;
        if(head==null) {
            System.out.println("Empty List ");
            return false;
        }
        while(temp!=null) {
            if(temp.data==data) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static int findMiddle(Node head,int length) {
        if(head==null) {
            return -1;
        }
        if(head.next==null) {
            return head.data;
        }
       Node slow = head;
       Node fast = head;
           while(fast!=null && fast.next != null) {
               slow=slow.next;
               fast=fast.next.next;
           }
           return slow.data;

    }
    public static void reverseLinkedList(Node head) {
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp = head;
        while(temp!=null) {
            temp.data = st.pop();
            temp=temp.next;
        }
    }



    public static void main(String[] args) {

        Node head = null;

        head = insertAtHead(head, 8);
        head = insertAtHead(head, 10);
        head = insertAtHead(head, 85);

        head = insertAtTail(head, 75);
        head = insertAtTail(head, 99);
        head = insertAtTail(head,100);

        display(head);

        System.out.println("Length : ");

        int length = length(head);

        System.out.println(length);
        int ans = findMiddle(head,length);
        System.out.println(ans);

        reverseLinkedList(head);
        display(head);
//
//        head = deleteByValue(head,8);
//        display(head);
//        boolean ans = isPresent(head,100);
//        System.out.println(ans);
//        display(head);

    }
}