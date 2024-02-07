import java.util.Stack;

public class Prefix2Postfix {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        
        // equal to (A+B)*(C-D) in infix expression
        String prefix_exp = "*+AB-CD";
        
        int len = prefix_exp.length();
        for (int i=len-1; i>=0; i--) {
            char c = prefix_exp.charAt(i);
            if (c=='+' || c=='-' || c=='*' || c=='/') {
                String first_operand = stack.pop();
                String second_operand = stack.pop();
                stack.push(first_operand + second_operand + c);
            } else {
                stack.push(""+c);
            }
        }

        System.out.println("[POSTFIX]: " + stack.peek());
    }
}
