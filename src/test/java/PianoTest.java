import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano yamaha;

    @Before
    public void before(){
        yamaha = new Piano("Yamaha", 2500.00, 0, "Birch", "black");
    }

    @Test
    public void checkAutoMarkUp(){
        assertEquals(4750.00, yamaha.getRrp(), 0.00003);
    }
}
