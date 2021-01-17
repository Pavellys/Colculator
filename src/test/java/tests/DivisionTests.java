package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTests extends BaseTest{
    @Test(priority = 1, retryAnalyzer = Retry.class)
    public void divisionTest7(){
        Assert.assertEquals(calculator.division(FIRST_NUMBER_TEST7, SECOND_NUMBER_TEST7), EXPECTED_RESULT_TEST7);
    }

    @Test(threadPoolSize = 2, invocationCount = 2)
    public void divisionTest8(){
        Assert.assertEquals(calculator.division(FIRST_NUMBER_TEST8, SECOND_NUMBER_TEST8), EXPECTED_RESULT_TEST8);
    }
}
