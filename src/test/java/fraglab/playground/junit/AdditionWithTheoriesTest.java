package fraglab.playground.junit;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class AdditionWithTheoriesTest {

//    @DataPoints
//    public static int[] integers() {
//        return new int[]{
//                -1, -10, -1234567, 1, 10, 1234567
//        };
//    }

    @DataPoint
    public static int a = 5;
    @DataPoint
    public static int b = 3;

    @Theory
    public void a_plus_b_is_greater_than_a_and_greater_than_b(Integer a, Integer b, Integer c) {
        System.out.println(String.format("a=%s, b=%s, c=%s", a, b, c));
        Assume.assumeTrue(a > 0 && b > 0);
        assertTrue(a + b > a);
        assertTrue(a + b > b);
    }

    @Theory
    public void addition_is_commutative(Integer a, Integer b) {
        System.out.println(String.format("a=%s, b=%s", a, b));
        assertTrue(a + b == b + a);
    }
}