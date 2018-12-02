import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar fender;

    @Before
    public void before(){
        fender = new Guitar("Guitar", 500.00, 0, "Oak", "brown");
    }

    @Test
    public void checkAutoMarkUp(){
//        Guitar fender = new Guitar("Guitar", 500.00, 0, "Oak", "brown");
        assertEquals(1000.00, fender.getRrp(), 0.00003);
    }

}
