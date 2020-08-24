package queue;

public class CircularQueue {
	int n=5;
	int a[]=new int[n];
	int front,rear;
	CircularQueue() {
		front=-1;
		rear=-1;
	}
	boolean isFull() {
		if(front==0&&rear==n-1)
			return true;
		if(front==rear+1)
			return true;
		return false;
	}
	boolean isEmpty() {
		if(front==-1)
			return true;
		else
			return false;
	}
	void enQueue(int x) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(front==-1&&rear==-1)
				front=0;
			rear=(rear+1)%n;
			a[rear]=x;
		
		}
		
	}
	int deQueue() {
		int ele;
		if(isEmpty()) {
			System.out.println("queue is empty");
			return (-1);
		}
		else {
			ele=a[front];
			if(front==rear)
				front=rear=-1;
			else {
				front=(front+1)%n;
			}
			return ele;
		}
	}
	void display() {
		if(isEmpty())
			System.out.println("queue is empty");
		else {
			int i=front;
			while(i!=rear) {
				System.out.print(a[i] + " ");
				i=(i+1)%n;
			}
			System.out.println(a[i]);
		}
	}
	public static void main(String args[]) {
		 CircularQueue q=new CircularQueue();
		   q.deQueue();
		   q.enQueue(1);
		    q.enQueue(2);
		    q.enQueue(3);
		    q.enQueue(4);
		    q.enQueue(5);
		    q.display();
		   System.out.println("dequeued element: "+ q.deQueue());
		   System.out.println( "dequeued element: "+q.deQueue());
		    q.display();
		   
	}

}
