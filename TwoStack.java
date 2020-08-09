package stack;

public class TwoStack {
	int size;
	int[] arr;
	int top1;
	int top2;
	TwoStack(int n){
		size=n;
		arr=new int[n];
		top1=n/2+1;
		top2=n/2;
	}
	void push1(int t) {
		if(top1>0) {
			top1--;
			arr[top1]=t;
			
		}
		else {
			System.out.println("stack overflow");
			return;
		}
	}
	void push2(int t) {
		if(top2<(size-1)) {
			top2++;
			arr[top2]=t;
			
		}
		else {
			System.out.println("stack overflow");
			return;
		}
	}
	int pop1() {
		if(top1<=size/2) {
			int x=arr[top1];
			top1++;
			return x;
		}
		else {
			System.out.println("stack underflow");
			return 0;
		}
	}
	int pop2() {
		if(top2>=(size/2+1)) {
			int x=arr[top2];
			top2--;
			return x;
		}
		else {
			System.out.println("stack underflow");
			return 0;
		}
	}
   public static void main(String args[]) {
	   TwoStack ts=new TwoStack(5);
	   ts.push1(2);
	   ts.push1(3);
	   ts.push2(0);
	   ts.push2(1);
	   System.out.println(ts.pop1()+" pooped from stack1");
	   System.out.println(ts.pop2()+" pooped from stack2");
   }
}
