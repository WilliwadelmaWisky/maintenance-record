package core.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */
public class TestDate {

    /**
     *
     */
    @Test
    public void testParse() {
        Date date = Date.parse("1.2.2000");
        assertEquals(1, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2000, date.getYear());
    }
}
