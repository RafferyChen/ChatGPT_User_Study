import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTestCase {
    Task task = new Task();

    @Test
    public void test1() {
        Assertions.assertEquals(2, task.longestContinousSubarray(new int[]{8, 2, 4, 7}, 4));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(3, task.longestContinousSubarray(new int[]{10, 1, 12, 8, 14, 5, 7}, 6));
    }

}
