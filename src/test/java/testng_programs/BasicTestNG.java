package testng_programs;

import org.testng.annotations.*;

public class BasicTestNG {
    @Test
    public void sample()
    {
        System.out.println("test1 method");
    }
    @BeforeMethod
    public void sample1()
    {
        System.out.println("Before method");
    }
    @Test
    public void sample2()
    {
        System.out.println("test2 method");
    }
    @AfterMethod
    public void sample3()
    {
        System.out.println("After method");
    }
    @BeforeClass
    public void sample4()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public void sample5()
    {
        System.out.println("After class");
    }
    @BeforeTest
    public void sample6()
    {
        System.out.println("Before test");
    }
    @AfterTest

    public void sample7()
    {
        System.out.println("After test");
    }
    @BeforeSuite
    public void sample8()
    {
        System.out.println("Before Suit");
    }
    @AfterSuite
    public void sample9()
    {
        System.out.println("After Suit");
    }
}
