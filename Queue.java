package queue;

public class Queue {
	int n=5;
	int a[]=new int[n];
	int front,rear;
	Queue() {
		front=-1;
		rear=-1;
	}
	void enQueue(int ele) {
		if(front==0&&rear==n-1)
			System.out.println("Queue is full");
		else {
			if(front==-1)
				front=0;
			rear++;
			a[rear]=ele;
		}
	}
	int deQueue() {
		int ele;
		if(front==-1) {
			System.out.println("Queue is empty");
			return (-1);
		}
		else {
			ele=a[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else
				front++;
		}
		return ele;
			
	}
	int peek() {
		int ele;
		if(front==-1) {
			System.out.println("Queue is empty");
			return (-1);
		}
		else {
			ele=a[front];
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
		}
		return ele;
	}
	void display() {
		if(front==-1)
			System.out.println("Empty queue");
		else {
			for(int i=front;i<=rear;i++)
				System.out.println(a[i]);
		}
	}
   public static void main(String args[]) {
	   Queue q=new Queue();
	   q.deQueue();
	   q.enQueue(1);
	    q.enQueue(2);
	    q.enQueue(3);
	    q.enQueue(4);
	    q.enQueue(5);
	    q.display();
	    q.deQueue();
	   System.out.println("peeked element: "+ q.peek());
	    
	    q.deQueue();
	    q.display();
	   
   }
}


