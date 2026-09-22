package Lab1;

class Lab11{
    static Node reverseList(Node head){
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        head = temp.prev;
        return head;
    }

    static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head=new Node(1);

        head.next=new Node(2);
        head.next.prev=head;

        head.next.next=new Node(3);
        head.next.next.prev=head.next;

        head.next.next.next=new Node(4);
        head.next.next.next.prev=head.next.next;

        printList(head);
        head=reverseList(head);
        printList(head);
    }
}

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
