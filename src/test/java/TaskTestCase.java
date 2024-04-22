import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTestCase {
    Task task = new Task();

    @Test
    public void test1() {
        Assertions.assertEquals(2, task.divisorSubstrings(240,2));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2, task.divisorSubstrings(430043,2));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(0, task.divisorSubstrings(123456,3));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(2, task.divisorSubstrings(101010,3));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(3, task.divisorSubstrings(555,1));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(1, task.divisorSubstrings(999999,6));
    }

}
