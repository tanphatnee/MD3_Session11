package bt.bt4;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        System.out.println("Nhap doan van:");
        String str = new Scanner(System.in).nextLine();
        Stack<String> stack = new Stack<String>();

        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


    }
}
