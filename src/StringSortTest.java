import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortTest {

    StringSort temp;

    @Before
    public void setUp() throws Exception {
        temp = new StringSort();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void StringsortingPostive(){
        String[] expected = { "a","brown","dog","fox","jumps","lazy","over","quick","the"};
        String[] result = temp.StringWordSort("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,result);
    }
}