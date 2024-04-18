import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        // given
        int term = 10;
        int expectedResult = 55; // The 10th term of Fibonacci sequence is 55

        // when
        int result = Fibonacci.fibonacci(term);

        // then
        assertEquals(expectedResult, result);
    }
}