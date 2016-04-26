package task01;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClassForTask01 {
    ClassForTask01 classForTask01;

    @BeforeClass
    public void beforeClass() {
        classForTask01 = new ClassForTask01();
    }

    @DataProvider(name = "values")
    public Object[][] values() {
        return new Object[][]{
                {"3443", true},
                {"1344", false},
                {"1384", false},
        };
    }
    @DataProvider(name = "valuesNotValid")
    public Object[][] valuesNotValid() {
        return new Object[][]{
                {"344tt3", false},
                {"1344tt", false},
                {"1384666", false},
        };
    }
    @DataProvider(name = "checkMessage")
    public Object[][] checkMessage() {
        return new Object[][]{
                {"344tt3", classForTask01.NOT_NUMBER},
                {"1344tt", classForTask01.NOT_NUMBER},
                {"1384666", classForTask01.NOT_4_FIGURES},
        };
    }

    @Test(dataProvider = "values")
    public void checkConditionTest(String actual, boolean expected) throws IOException {
        Assert.assertEquals(classForTask01.checkCondition(actual), expected);
    }

    @Test(expectedExceptions = IOException.class, dataProvider = "valuesNotValid")
    public void checkVotValidNumbers(String actual, boolean expected) throws IOException {
        Assert.assertEquals(classForTask01.checkCondition(actual), expected);
    }
    @Test(dataProvider = "checkMessage")
    public void checkMessage(String actual, String expected) throws IOException {
        if (!classForTask01.checkNumber(actual)) {
            Assert.assertEquals(classForTask01.message, expected);
        }else {
            Assert.fail();
        }
    }
}
