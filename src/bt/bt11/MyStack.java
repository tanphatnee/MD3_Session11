package bt.bt11;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(5);
        stack.add(8);
        stack.add(15);
        stack.add(2);
        stack.add(225);

        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) > stack.peek()) {
                stack.push(stack.get(i));
            }
        }

        System.out.println("Max: " + stack.pop());
    }
    }
}
