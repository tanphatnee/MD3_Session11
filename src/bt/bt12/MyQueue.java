package bt.bt12;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> listNumber = new ArrayDeque<>();

        listNumber.offer(2);
        listNumber.offer(5);
        listNumber.offer(1);
        listNumber.offer(9);
        listNumber.offer(7);
        listNumber.offer(200);

        System.out.println(listNumber);


        int smallest = listNumber.poll();

        // B4: So sánh và sắp xếp phần tử
        int initialSize = listNumber.size(); // Lưu kích thước ban đầu

        // B4: So sánh và sắp xếp phần tử
        for (int i = 0; i < initialSize; i++) {
            int current = listNumber.poll();
            if (current < smallest) {
                listNumber.offer(smallest);
                smallest = current;
            } else {
                listNumber.offer(current);
            }
        }

        System.out.println("Số nhỏ nhất là:  " + smallest);
    }
}
