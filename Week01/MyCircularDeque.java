/**
 * 自己设计循环双端队列
 */
class MyCircularDeque {

    int[] myqueue;
    int front = 0;//队头指针
    int rear = 0;//队尾指针
    int size = 0;//队列当前的大小
    int capacity;//队列的容量

    public MyCircularDeque(int k) {
        this.myqueue = new int[k];
        this.capacity = k;
    }

    public boolean insertFront(int value) {
        if(rear == front && size == capacity) {
            return false;
        } else {
            front = (front + capacity - 1) % capacity;
            myqueue[front] = value;
            size++;
            return true;
        }
    }

    public boolean insertLast(int value) {
        if(rear == front && size == capacity) {
            return false;
        } else {
            myqueue[rear] = value;
            rear = (rear + 1 + capacity) % capacity;
            size++;
            return true;
        }
    }

    public boolean deleteFront() {
        if(rear == front && size == 0) {
            return false;
        } else {
            front = (front + 1) % capacity;
            size--;
            return true;
        }
    }

    public boolean deleteLast() {
        if(rear == front && size == 0) {
            return false;
        } else {
            rear = (rear + capacity - 1) % capacity;
            size--;
            return true;
        }
    }

    public int getFront() {
        if((rear == front) && size == 0) {
            return -1;
        } else {
            return myqueue[front];
        }
    }

    public int getRear() {
        if((rear == front) && size == 0) {
            return -1;
        } else {
            return myqueue[(rear + capacity - 1) % capacity];
        }
    }

    public boolean isEmpty() {
        return (rear == front) && size == 0;
    }

    public boolean isFull() {
        return rear == front && size == capacity;
    }

}