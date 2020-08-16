package stack;

import java.util.Stack;

public class InfixToPrefix {
	static int prec(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		
		}
		return -1;
	}
	static String infixToPostfix(String exp) {
		String result="";
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(prec(c)>0) {
				while(stack.isEmpty()==false && prec(stack.peek())>=prec(c)) {
					result+=stack.pop();
				}
				stack.push(c);
			}
			else if(c==')') {
				char x=stack.pop();
				while(x!='(') {
					result+=x;
					x=stack.pop();
				}
			}
			else if(c=='(') {
				stack.push(c);
			}
			else {
				result+=c;
			}
		}
		for(int i=0;i<=stack.size();i++) {
			result+=stack.pop();
		}
		return result;
		
	}
	static String reverse(String exp) {
		char ch[]=exp.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	    	if(ch[i]=='(') {
	    		rev=rev+')';
	    	}
	    	else if(ch[i]==')') {
	    		rev=rev+'(';
	    	}
	    	else
	        rev+=ch[i];  
	    }  
	    return rev;  
	}
	public static void main(String args[]) {
		String exp="(A - B/C) * (A/K-L)";
		System.out.println("Infix exp: "+exp);
		String rev=new String();
		rev=reverse(exp);
		System.out.println("reversed string: "+rev);
		String post=infixToPostfix(rev);
		System.out.println("postfix expression "+post);
		String pre=reverse(post);
		System.out.println("Prefix expression: "+pre);
		
	}

}
