package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        // !!! must use your ArrayStack or LinkedListStack in problem 1
        // print with the following format. System.out.println() will not pass test.
        LinkedListStack<ListNode> stack = new LinkedListStack();
        ListNode tempNode = list;

        while (tempNode != null) {
            stack.push(tempNode);
            tempNode = tempNode.next;
        }

        while (stack.size() > 1) {
            print.println(stack.pop().val);
        }
           // place holder
    }
}
