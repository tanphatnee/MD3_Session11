package bt.bt15;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        Stack<String> list = new Stack<>();

        while (number / 2 != 0) {
            list.push(String.valueOf(number % 2));
            number /= 2;
        }
        String result = "1";
        while (!list.isEmpty()) {
            result += list.pop();
        }
        System.out.println(result);
    }
}
