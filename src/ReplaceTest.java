import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {

    Replace temp;

    @Before
    public void setUp() throws Exception {
        temp=new Replace();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void replacePositive(){
        String expected = "faity fry";
        String result = temp.replaceChar("daily dry");
        assertEquals(expected,result);
    }
}