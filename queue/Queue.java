package queue;

public class Queue {
	int items[];
	int front = 0;
	int rear = 0;

	void size(int size) {
		items = new int[size];
	}

	/*
	 * void enqueue(int data) {
	 * 
	 * if(!isFull()) { if(rear==l.length && front>0) { rear=0; }
	 * 
	 * l[rear]=data; rear++;
	 * 
	 * 
	 * }else { System.out.println("Is full"); }
	 * 
	 * }
	 * 
	 * void dequeue() { if(!isEmpty()) {
	 * 
	 * if(front==l.length ) { front=0;
	 * 
	 * }
	 * 
	 * l[front]=0; front++; } }
	 * 
	 * boolean isFull() { if (front == 0 && rear == l.length ) { return true; } if
	 * (front == rear + 1) { return true; } return false; } boolean isEmpty() {
	 * return front==-1?true:false; }
	 */
	void iterate() {
		for(int i=0;i<items.length;i++) {
			System.out.print(items[i]);
		}
		System.out.println();
	}

    // Check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == items.length - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    void enQueue(int element) {
        if ((rear+1)%items.length==front) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % items.length;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front = (front + 1) % items.length;
            }
            return (element);
        }
    }
}
