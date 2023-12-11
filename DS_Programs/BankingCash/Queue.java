package org.example.DS_Programs.BankingCash;
class Queue {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    //initialsing queue array with capacity size
    Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    // computing where the current size of array is equal to capacity of array
    boolean isFull() {
        return (this.size == this.capacity);
    }
    // checking whether current size of array is 0 or not
    boolean isEmpty() {
        return (this.size == 0);
    }
    // adding items to the rear end of queue
    void enqueue(int item) {
        if (isFull()) {  // if current queue capacity is full
            System.out.println("Queue is full, cannot add more people.");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }
    // remove people from front in queue and return the removed person
    int dequeue() {
        if (isEmpty()) {   // if current queue is empty
            System.out.println("Queue is empty, no people to dequeue.");
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    public int getFront() {
        return front;
    }
}

