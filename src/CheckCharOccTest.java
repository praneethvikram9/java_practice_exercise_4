import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCharOccTest {
    CheckCharOcc temp;

    @Before
    public void setUp() throws Exception {
        temp= new CheckCharOcc();
    }

    @After
    public void tearDown() throws Exception {
        temp = null;
    }

    @Test

    public void checkOccPositive(){
        int expected = 11;
        int result = temp.CheckOcc("Java is java again java again count number of occurrence of a in the given string",'a');
        assertEquals(expected,result);
    }
}