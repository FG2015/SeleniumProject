package day05_TestNG_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {
@BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running");
    }



    @Test
    public void Test1(){
        System.out.println("TEst 1 is running ");

        String actual ="apple";
        String expected= "apple";
        Assert.assertEquals(actual,expected);


    }


    @Test
    public void Test2(){
        System.out.println("Test 2 is running");


        String actual ="apple";
        String expected= "apple";
        Assert.assertTrue(actual.equals(expected ));
    }

}
