package stack;
import java.util.Stack;
public class PrefixToPostfix {
	public static String prefixToPostfix(String exp) {
		String result="";
		Stack<String> stack=new Stack<>();
		for(int i=exp.length()-1;i>=0;i--) {
			char ch=exp.charAt(i);
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^') {
				String x=stack.pop();
				String y=stack.pop();
				result=x+y+ch;
				stack.push(result);
			}
			else {
				stack.push(exp.charAt(i)+"");
			}
		}
		return result;
	}
	public static void main(String args[]) {
		String exp="*+AB-CD";
		System.out.println("prefix exp:"+exp);
		System.out.println("postfix exp: "+prefixToPostfix(exp));
	}

}
