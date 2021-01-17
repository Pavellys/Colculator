package tests;

import culc_actions.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import test_data.TestConstants;

@Listeners(TestListener.class)
public  class BaseTest implements TestConstants {
    Calculator calculator;

    @BeforeMethod
    public void initTest(){
        initCulc();
    }

    public void initCulc(){
        calculator = new Calculator();
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("Good luck");
    }
}
