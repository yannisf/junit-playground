package fraglab.playground.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicTest.class,
        ExceptionTest.class
})
public class PlaygroundSuite {

}
