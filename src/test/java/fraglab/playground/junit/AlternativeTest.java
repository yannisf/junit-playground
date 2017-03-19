package fraglab.playground.junit;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

public class AlternativeTest {

    @Test
    public void alternativeTestOne() {
        System.out.println("alternativeTestOne");
    }

    @Test
    @Category(CustomCategory.class)
    public void alternativeTestTwo() {
        System.out.println("alternativeTestTwo");
    }

}
