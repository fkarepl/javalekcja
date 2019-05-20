import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void twoWordsShouldBeUnitedBySpaceTest() {
        String result = Hello.concatenate("Hello", "World");
        Assert.assertEquals("Hello World", result);
    }
/*
    @Test
    public void badTest() {
        String result = Hello.concatenate("Hello", "World");
        Assert.assertEquals("HelloWorld", result);
    }
*/
}
