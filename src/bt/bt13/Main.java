package bt.bt13;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] arr = str.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.size() == 0) {
                stack.push(arr[i]);
            } else {
                if (arr[i] != " " && stack.peek().compareTo(arr[i]) > 0) {
                    stack.push(arr[i]);
                }
            }
        }
        System.out.println(stack);
    }
}
