package Lab1;

import java.util.LinkedList;

class Lab14 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }

}

class Queue {
    int size;
    int rear;
    int front;
    LinkedList<Integer> data = new LinkedList<>();

    Queue() {
        size = 0;
        rear = -1;
        front = 0;
    }

    void offer(int value) {
        rear++;
        size++;
        data.add(value);
    }

    void poll() {
        if (size > 0) {
            data.remove(0);
            size--;
        }
    }

    int peek() {
        return data.get(front);
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }
}
