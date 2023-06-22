package bt.bt6;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        System.out.println("Nhap vao bieu thuc:");
        String expression = new Scanner(System.in).nextLine();

        if (isParenthesesValid(expression)) {
            System.out.println("Biểu thức có dấu ngoặc hợp lệ.");
        } else {
            System.out.println("Biểu thức có dấu ngoặc không hợp lệ.");
        }

    }
    public static boolean isParenthesesValid(String expression) {
        Stack<Character> stack = new Stack<>();

        // Duyệt qua từng ký tự trong biểu thức
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                // Nếu là dấu mở ngoặc, đẩy vào Stack
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                // Nếu là dấu đóng ngoặc, kiểm tra ngoặc hợp lệ
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // Kiểm tra xem Stack có rỗng sau khi duyệt hết biểu thức hay không
        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }
}
