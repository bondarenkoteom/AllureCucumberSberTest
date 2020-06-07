package sber;

import org.junit.After;
import org.junit.Before;
import steps.BaseSteps;

public class BaseTest {

    @Before
    public void startUp() {
        BaseSteps.setUp();
    }

    @After
    public void end() {
        BaseSteps.tearDown();
    }
}
