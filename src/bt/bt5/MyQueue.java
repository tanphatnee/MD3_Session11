package bt.bt5;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
     System.out.println("Nhap doan van:");
     String str = new Scanner(System.in).nextLine();

        if (isPalindrome(str)) {
            System.out.println("Chuỗi là palindrome.");
        } else {
            System.out.println("Chuỗi không phải là palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        // Loại bỏ khoảng trắng và chuyển đổi chuỗi thành chữ thường
        String processedStr = str.replaceAll("\\s+", "").toLowerCase();

        // Tạo một Queue và một Stack để lưu trữ các ký tự
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Thêm các ký tự từ chuỗi vào Queue và Stack
        for (int i = 0; i < processedStr.length(); i++) {
            char c = processedStr.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        // Kiểm tra tính palindrome bằng cách so sánh các ký tự từ Queue và Stack
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
