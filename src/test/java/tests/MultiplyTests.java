package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTests extends BaseTest{
    @Test(priority = 1)
    public void multiplyTest5(){
        Assert.assertEquals(calculator.multiply(FIRST_NUMBER_TEST5, SECOND_NUMBER_TEST5), EXPECTED_RESULT_TEST5);
    }

    @Test(description = "Multiply 100x100")
    public void multiplyTest6(){
        Assert.assertEquals(calculator.multiply(FIRST_NUMBER_TEST6, SECOND_NUMBER_TEST6), EXPECTED_RESULT_TEST6);
    }
}
