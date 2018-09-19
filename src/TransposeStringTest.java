import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString temp;

    @Before
    public void setUp() throws Exception {
        temp = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        temp = null;
    }

    @Test
    public void transposePositive(){
        String expected = "a kciuq nworb xof spmuj revo eht yzal god";
        String result = temp.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,result);
    }
}