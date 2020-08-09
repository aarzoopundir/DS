package list;

public class CircularLinkedList {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void insertAtBeg(int data) {
		Node toAdd=new Node(data);
		if(head==null) {
			head=toAdd;
			tail=toAdd;
			toAdd.next=head;
		}
		else {
			Node curr=head;
			toAdd.next=curr;
			head=toAdd;
			tail.next=head;
		}
		                                                                                                                                                                              
	}
	public void insertAtEnd(int data) {
		Node toAdd=new Node(data);
		if(head==null) {
			head=toAdd;
			tail=toAdd;
			toAdd.next=head;
		}
		else {
			tail.next=toAdd;
			tail=toAdd;
			tail.next=head;
		}
	}
	public void RemoveLast() {
		Node curr=head;
		if(curr==null)
			System.out.println("cannot remove from empty list");
		if(curr.next==null) {
			head=null;
			tail=null;
		}
		while(curr.next!=tail) {
			curr=curr.next;
		}
		
		tail=curr;
		tail.next=head;
	}
	public void RemoveBeg() {
		if(head==null)
			System.out.println("cannot remove from empty list");
		if(head.next==null) {
			head=null;
			tail=null;
		}
		
		head=head.next;
		tail.next=head;
	}
	static int isCircular(Node head)
	{
	  Node curr=head;
	  if(head==null)
	    return 1;
	  while(curr.next!=head){
	    curr=curr.next;
	  }
	  if(curr==head)
	    return 1;
	  return 0;

	}
	public void display() {
		Node curr=head;
		if(head==null)
			System.out.println("List is empty");
		else {
		do {
			System.out.println(curr.data);
			curr=curr.next;
		}while(curr!=head);
	}}
	public static void main(String args[]) {
		CircularLinkedList ll=new CircularLinkedList();
		System.out.println("insertion at beg");
		for(int i=0;i<10;i++) {
			ll.insertAtBeg(i);
		}
		ll.display();
		ll.RemoveLast();
		System.out.println("remove last");
		ll.display();
		ll.RemoveBeg();
		System.out.println("remove beg");
		ll.display();
		 Node n1 = new Node(34);
	        Node n2 = new Node(25);
	        Node n3 = new Node(31);
	        Node n4 = new Node(56);
	        Node n5 = new Node(45);
	        n1.next = n2;
	        n2.next = n3;
	        n3.next = n4;
	        n4.next = n5;
	        n5.next = n1;
		int x = isCircular(n1);
	      System.out.println(x);
		/*System.out.println("insertion at end");
		for(int i=0;i<10;i++) {
			ll.insertAtEnd(i);
		}
		ll.display(); */
	}

}
