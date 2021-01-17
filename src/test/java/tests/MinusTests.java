package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinusTests extends BaseTest{
    @Test(invocationCount = 3)
    public void minusTest3(){
        Assert.assertEquals(calculator.minus(FIRST_NUMBER_TEST3, SECOND_NUMBER_TEST3), EXPECTED_RESULT_TEST3);
    }

    @DataProvider(name = "Minus test")
    public Object[][] inputForMinus() {
        return new Object[][]{
                {FIRST_NUMBER_TEST4,SECOND_NUMBER_TEST4}
        };
    }

    @Test(priority = 1, dataProvider = "Minus test")
    public void minusTest4(int firstNumber, int secondNumber){
        Assert.assertEquals(calculator.minus(firstNumber, secondNumber), EXPECTED_RESULT_TEST4);
    }
}
