package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTests extends BaseTest{
    @DataProvider(name = "Sum tests")
    public Object[][] inputForSum() {
        return new Object[][]{
                {FIRST_NUMBER_TEST1,SECOND_NUMBER_TEST1}
        };
    }

    @Test(description = "This test checking of sum two numbers", dataProvider = "Sum tests", retryAnalyzer = Retry.class)
    public void sumTest1(int firstNumber, int secondNumber){
        Assert.assertEquals(calculator.sum(firstNumber, secondNumber), SUM_EXPECTED_RESULT_TEST1);
    }

    @Test(invocationCount = 3, priority = 1)
    public void sumTest2(){
        Assert.assertEquals(calculator.sum(FIRST_NUMBER_TEST2, SECOND_NUMBER_TEST2), SUM_EXPECTED_RESULT_TEST2);
    }

}
