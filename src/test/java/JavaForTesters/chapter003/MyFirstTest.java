package JavaForTesters.chapter003;
import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        Assert.assertEquals("2+2=4", 4, answer );
    }

    @Test
    public void canSubtractTwoFromTwo(){
        int answer = 2-2;
        Assert.assertEquals("2-2=0", 0, answer );
    }

    @Test
    public void canDivideTwoByTwo(){
        int answer = 4/2;
        Assert.assertEquals("4/2=2", 2, answer );
    }

    @Test
    public void canMultiplyTwoByTwo(){
        int answer = 2*2;
        Assert.assertEquals("2*2=4", 4, answer );
    }



}