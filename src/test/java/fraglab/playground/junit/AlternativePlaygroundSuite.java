package fraglab.playground.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        AlternativeTest.class,
        BasicTest.class
})
@Categories.ExcludeCategory(CustomCategory.class)
public class AlternativePlaygroundSuite {

}
