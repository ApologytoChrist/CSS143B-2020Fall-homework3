package Problem1;

public class ValidParentheses {


    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        LinkedListStack stack = new LinkedListStack();
        if (str == null || str.equals("")) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char parentheses = str.charAt(i);
            switch (parentheses) {
                case '(' :
                case '[' :
                case '{' :
                    stack.push(parentheses);
                    break;

                case ')' :
                    if (stack.peek() == null) {
                        return false;
                    } else if (stack.peek().equals('(')) {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                case ']' :
                    if (stack.peek() == null) {
                        return false;
                    } else if (stack.peek().equals('[')) {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                case '}' :
                    if (stack.peek() == null) {
                        return false;
                    } else if (stack.peek().equals('{')) {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }

                default:
                    return false;
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
