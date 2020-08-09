package stack;

public class Stack {
  static final int max=100;
  int top=-1;
  int[] a=new int[max];
  boolean push(int x) 
  { 
      if (top >= (max - 1)) { 
          System.out.println("Stack Overflow"); 
          return false; 
      } 
      else { 
          a[++top] = x; 
          System.out.println(x + " pushed into stack"); 
          return true; 
      } 
  }
  int pop() {
	  if(top<0) {
		  System.out.println("stack underflow");
		  return 0;
	  }
	  else {
		  int x=a[top];
		  top--;
		  return x;
	  }
  }
  int peek() {
	  if(top<0) {
		  System.out.println("stack underflow");
		  return 0;
	  }
	  else {
		  int x=a[top];
		  return x;
	  }
  }
  public static void main(String args[]) {
		Stack st=new Stack();
		for(int i=0;i<10;i++) {
			st.push(i);
		
		}
		System.out.println(st.pop()+" popped out");
		System.out.println(st.peek()+" peeked element");
	}
}
