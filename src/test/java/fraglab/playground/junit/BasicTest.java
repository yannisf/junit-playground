package fraglab.playground.junit;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)
public class BasicTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass: BasicTest");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass: BasicTest");
    }

    @Before
    public void before() {
        System.out.println("---Before test---");
    }

    @After
    public void after() {
        System.out.println("---After test---");
    }

    @Test
    public void testOne() {
        System.out.println("testOne");
    }

    @Test
    public void testTwo() {
        System.out.println("testTwo");
    }

    @Ignore("testThree: Ignored")
    @Test
    public void testThree() {
        System.out.println("testThree");
    }

}
