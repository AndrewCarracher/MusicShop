import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {


    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Violin", 1700.00, 0, "Elm", "brown");
    }

    @Test
    public void checkAutoMarkUp(){
        assertEquals(2890.00, violin.getRrp(), 0.00003);
    }
}
