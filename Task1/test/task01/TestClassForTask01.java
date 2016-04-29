package task01;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestClassForTask01 {
    ClassForTask01 classForTask01;

    @BeforeClass


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
                {"344663", false},
                {"13446666666666", false},
                {"1384666", false},
        };
    }


    @Test(dataProvider = "values")
    public void checkConditionTest(String actual, boolean expected) throws Exception {
        Assert.assertEquals(classForTask01.checkCondition(actual), expected);
    }

    @Test(expectedExceptions = Exception.class, dataProvider = "valuesNotValid")
    public void checkVotValidNumbers(String actual, boolean expected) throws Exception {
        Assert.assertEquals(classForTask01.checkCondition(actual), expected);
    }

}
