package bt.bt1;



import java.util.ArrayDeque;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque();
        queue.offer("Hung");
        queue.offer("Hieu");
        queue.offer("Giang");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
