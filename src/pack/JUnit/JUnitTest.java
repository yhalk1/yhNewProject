package pack.JUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JUnitTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    public void add_test (){
        Addition app1 = new Addition();

        assertEquals(10, app1.add(5,5));
        assertNotEquals(123, app1.add(120,4));
        System.out.println("Running Test");

    }

    @Test
    public void add_test2 (){
        Addition app2 = new Addition();

        assertEquals(-10, app2.add(-5,-5));
        assertNotEquals(-123, app2.add(-120,-4));
        System.out.println("Running Test");

    }

    @After
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

}
