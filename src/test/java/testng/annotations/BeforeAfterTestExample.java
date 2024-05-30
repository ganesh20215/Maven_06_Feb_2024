package testng.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestExample {

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before Test Demo for BeforeAfterTestExample class");
    }

    @AfterTest
    public void afterTestDemo(){
        System.out.println("After Test Demo BeforeAfterTestExample class");
    }

    @Test
    public void verifyTestCases_1(){
        System.out.println("verify test cases 1");
    }

    @Test
    public void verifyTestCases_2(){
        System.out.println("verify test cases 2");
    }

}
