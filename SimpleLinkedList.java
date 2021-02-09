package linkedListDs;

public class SimpleLinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node n1=new Node(15);
        Node n2=new Node(12);
        Node n3=new Node(20);
        head.next=n2;
        n2.next=n1;
        n1.next=n3;
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
