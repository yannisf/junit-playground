package fraglab.playground.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = RuntimeException.class)
    public void testException() {
        System.out.println("testException");
        throw new RuntimeException("Message");
    }

    @Test
    public void testExpectedException() throws IndexOutOfBoundsException {
        System.out.println("testExpectedException");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Message");
        throw new RuntimeException("Message");
    }
}
