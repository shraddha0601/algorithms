import java.io.IOException;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/8/15
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReversePolish {
    public static void main(String[] args) throws IOException {
        String[] tokens = new String[] { "2", "1", "/", "3", "*" };
        System.out.println(evalRPN(tokens));
    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "+-*/";
        int tempResult = 0;

        for (String token : tokens) {
            if(operators.contains(token)) {
                int a = stack.pop();
                int b = stack.pop();

                int indexOp = operators.indexOf(token);
                switch (indexOp) {
                    case 0:
                        tempResult = a + b;
                        break;
                    case 1:
                        tempResult = b-a;
                        break;
                    case 2:
                        tempResult = a*b;
                        break;
                    case 3:
                        tempResult = b/a;
                        break;
                }
                stack.push(tempResult);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
