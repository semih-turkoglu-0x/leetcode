import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolish {
	public int evalRPN(String[] tokens) {
		Deque<String> stack = new ArrayDeque<>();
		for (String token : tokens) {
			if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
				int b = Integer.parseInt(stack.pop());
				int a = Integer.parseInt(stack.pop());
				switch (token) {
					case "+":
						stack.push(String.valueOf(a+b));
						break;
					case  "-":
						stack.push(String.valueOf(a-b));
						break;
					case "*":
						stack.push(String.valueOf(a*b));
						break;
					case  "/":
						stack.push(String.valueOf(a/b));
				}
			} else {
				stack.push(token);
			}
		}
		return Integer.parseInt(stack.pop());
	}
}
