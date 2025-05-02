package arifin;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A Queue")
public class QueueTest {
    private Queue<String> queue;

  @Nested
  @DisplayName("when new")
  public class WhenNew {

    @BeforeEach
    void setUp() {
        System.out.println("settt up");
      queue = new LinkedList<>();
    }

    @Test
    @DisplayName("when offer, size must be 1")
    void offerNewData() {
        System.out.println("offerNewData");
      queue.offer("Eko");
      Assertions.assertEquals(1, queue.size());
    }

    @Test
    @DisplayName("when offer 2 data, size must be 2")
    void offerMoreData() {
        System.out.println("offerMoreData");
      queue.offer("Eko");
      queue.offer("Kurniawan");
      Assertions.assertEquals(2, queue.size());
    }
  }
}
