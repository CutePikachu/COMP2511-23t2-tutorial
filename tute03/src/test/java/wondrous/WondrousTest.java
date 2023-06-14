package wondrous;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WondrousTest {
    @Test
    public void testBasic() {
        Wondrous w = new Wondrous();
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 10, 5, 16, 8, 4, 2, 1));
        
        assertEquals(expected, w.wondrous(3));
    }

    @Test
    public void testStartFrom1() {
        var w = new Wondrous();
        var expected = Arrays.asList();
        assertEquals(expected, w.wondrous(1));
    }

    @Test
    public void testStartFromEven() {
        var w = new Wondrous();
        var expected = Arrays.asList(2, 1);
        assertEquals(expected, w.wondrous(2));
    }
}
