package stack;
import java.util.Stack;

public class EvaluatePostfix {
	static int evaluatePostfix(String exp) {
		
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(c=='+') {
				int x=stack.pop();
				int y=stack.pop();
				stack.push(y+x);
			}
			else if(c=='-') {
				int x=stack.pop();
				int y=stack.pop();
				stack.push(y-x);
			}
			else if(c=='*') {
				int x=stack.pop();
				int y=stack.pop();
				stack.push(y*x);
			}
			else if(c=='/') {
				int x=stack.pop();
				int y=stack.pop();
				stack.push(y/x);
			}
			else {
				stack.push(c-'0');
			}
		}
		return stack.pop();
	}
  public static void main(String args[]) {
	  String exp="231*+9-";
	  System.out.println("postfix evaluation "+evaluatePostfix(exp));
  }
}
