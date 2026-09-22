package Lab1;

class Lab13{
    public static void main(String[] args){
        StackNode stack = new StackNode();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}


class StackNode{

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top;
    int size;


    StackNode(){
        this.size = 0;
        this.top = null;
    }

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(-1);
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(-1);
        }
        return top.data;
    }
    boolean isEmpty(){
        return size == 0;
    }
    int size(){
        return size;
    }





}