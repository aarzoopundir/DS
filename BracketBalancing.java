import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.nextLine();
            Stack<Character> stack=new Stack<>();
            boolean isBalanced=true;

            //Complete the code
            for(int i=0;i<input.length();i++)
            {
                char ch=input.charAt(i);
                if(ch=='('||ch=='{'||ch=='[')
                {
                    stack.push(ch);
                    continue;
                }
                if(stack.isEmpty())
                {
                    isBalanced=false;
                    break;
                }
                if(ch==')'){
                    if(stack.peek()== '(')
                    stack.pop();
                    else
                    {
                     isBalanced=false;
                     break;
                    }

                }
                 if(ch=='}'){
                    if(stack.peek()== '{')
                    stack.pop();
                    else
                    {
                     isBalanced=false;
                     break;
                    }

                }
                 if(ch==']'){
                    if(stack.peek()== '[')
                    stack.pop();
                    else
                    {
                     isBalanced=false;
                     break;
                    }

                }
            }
            if(!stack.isEmpty())
            isBalanced=false;
            if(isBalanced)
            {
                System.out.println("true");
            }
            else
            System.out.println("false");

		}
		
	}
}
