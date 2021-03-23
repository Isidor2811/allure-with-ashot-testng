package regression_tests;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RegressionTestClass {


    @Test
    public void additionTest() {
        assertThat(3 + 3, is(equalTo(6)));
    }
}
