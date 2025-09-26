public class QueueUsingArray {
	private int maxSize;
	private int front;
	private int rear;
	private int[] queue;
	QueueUsingArray(int maxSize) {
		this.maxSize = maxSize;
		this.front = -1;
		this.rear = -1;
		this.queue = new int[maxSize];
	}
	public boolean isEmpty() {
		return front == -1;
	}
	public boolean isFull() {
		return rear == maxSize - 1;
	}
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		return rear + 1;
	}
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue.");
		} else if (rear == -1 && front == -1) {
			rear = rear + 1 ;
			front = front + 1 ;
			queue [ rear] = data ;

		}  else {
			rear = rear + 1 ;
			queue[rear] = data;
		}
	}
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		} else if (front == rear) {
			int data = queue[front];
			front = rear = -1 ;
			return data;
		} else {
			int data = queue [front ];
			front = front + 1 ;
			return data ;
		}
	}
	public void peek() {
		if (front == -1) {
			System.out.println("Queue is empty");
		} else
			System.out.println("Front element: " + queue[front]);
	}

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(5);

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);


		queue.peek();


		System.out.println("Queue size: " + queue.size());

		while (!queue.isEmpty()) {
			System.out.println("Dequeue: " + queue.dequeue());
		}


		System.out.println("Queue size after dequeue: " + queue.size());
	}
}
