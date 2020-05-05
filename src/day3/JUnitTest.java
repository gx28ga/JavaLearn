package day3;
import org.junit.Test;

import java.util.Date;

public class JUnitTest {

    @Test
    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

        Object obj = new String("ssss");
        Date date = (Date)obj;
    }
}
