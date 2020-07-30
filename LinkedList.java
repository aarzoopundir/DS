package list;
public class LinkedList {
	Node head;
    static class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		this.next=null;
    	}
    }
    public void insertAtLast(int data) {
    	Node toAdd=new Node(data);
    	Node temp=head;
    	if(head==null) {
    		head=toAdd;
    		return;
    	}
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=toAdd;
    }
    public void insertAtBeg(int data) {
    	Node toAdd=new Node(data);
    	Node temp=head;
    	if(head==null) {
    		head=toAdd;
    	}
    	head=toAdd;
    	head.next=temp;
    }
    public void insertAtPos(int data,int key) {
    	Node temp=head;
    	while(temp.data!=key) {
    		temp=temp.next;
    	}
    	temp.data=key;
    }
    public void merge(LinkedList ll,LinkedList lll) {
    	Node curr=ll.head;
    	Node last=lll.head;
    	while(curr.next!=null) {
    		curr=curr.next;
    	}
    	curr.next=last;
    }
    public boolean search(LinkedList ll,int d) {
    	Node curr=head;
    	while(curr!=null) {
    		if(curr.data==d)
    			return true;
    		curr=curr.next;
    	}
    	return false;
    }
    public void removeLast() {
    	Node temp=head;
    	//Node toRemove=head;
    	if(temp==null) {
    		System.out.println("cannot remove from empty node");
    		return;}
    	if(temp.next==null) {
    		head=null;
    	}
    	while(temp.next.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=null;
    }
    Node deleteNode(Node head, int position) {
        Node curr=head;
        Node prev=head;
        Node last=null;
        if (position == 0) {
            head = curr.next; 
            return head;
        }
        while(position>0){
            prev=curr;
            curr=curr.next;
            position--;
        }
        last=curr.next;
       
        prev.next=last;
        return head;


    }
    void print() {
    	Node temp=head;
    	while(temp!=null) {
    		System.out.println(temp.data+" ");
    		temp=temp.next;
    	}
    }
}
