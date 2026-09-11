package Lab1;

class Lab12{
    static SingleNode rotateList(SingleNode head, int k){
        SingleNode curr;
        SingleNode tail = head;

        for (int i = 0; i < k; i++){
            while (tail.next != null){
                tail = tail.next;
            }
            curr = head;
            head = curr.next;
            tail.next = curr;
            curr.next = null;
        }
        return head;
    }

    static void printList(SingleNode head){
        SingleNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        SingleNode head=new SingleNode(1);
        head.next=new SingleNode(2);
        head.next.next=new SingleNode(3);
        head.next.next.next=new SingleNode(4);
        head.next.next.next.next=new SingleNode(5);

        int k = 2;

        printList(head);
        head = rotateList(head,k);
        printList(head);
    }
}

class SingleNode {
    int data;
    SingleNode next;
    SingleNode(int data) {
        this.data = data;
        this.next = null;
    }
}
