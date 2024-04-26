import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTestCase {
    Task task = new Task();

    @Test
    public void test1() {
        Assertions.assertEquals(4, task.maxConsecutiveAnswers("TTFF",2));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(3, task.maxConsecutiveAnswers("TFFT",1));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(5, task.maxConsecutiveAnswers("TTFTTFTT",1));
    }

}
