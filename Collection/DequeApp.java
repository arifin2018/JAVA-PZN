package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("Nur");
        deque.offerLast("Arifin");
        deque.offerLast("Azriel");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println("======================================================================");
        
        Deque<String> deque2 = new ArrayDeque<>();
        deque2.offerFirst("Nur2");
        deque2.offerFirst("Arifin2");
        deque2.offerFirst("Azriel2");
        System.out.println(deque2.pollFirst());
        System.out.println(deque2.pollFirst());
        System.out.println(deque2.pollFirst());
    }
}
